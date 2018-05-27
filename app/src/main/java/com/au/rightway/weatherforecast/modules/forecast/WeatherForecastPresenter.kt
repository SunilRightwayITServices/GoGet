package com.au.rightway.weatherforecast.modules.forecast

import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.*
import com.au.rightway.weatherforecast.networking.responsemodels.Currently
import com.au.rightway.weatherforecast.networking.responsemodels.DailyData
import com.au.rightway.weatherforecast.networking.responsemodels.WeatherData
import com.au.rightway.weatherforecast.networking.WeatherForecastApi
import com.au.rightway.weatherforecast.utils.Helper
import com.au.rightway.weatherforecast.utils.Helper.RowType.*
import com.au.rightway.weatherforecast.utils.Helper.formatDateToDisplay
import com.au.rightway.weatherforecast.utils.SchedulersProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import java.util.*

class WeatherForecastPresenter(private val weatherForecastApi: WeatherForecastApi, private val schedulersProvider: SchedulersProvider) : WeatherForecastContract.Presenter {

    private var mainView: WeatherForecastContract.View? = null

    private val disposables = CompositeDisposable()

    private var currentWeatherData = Currently()

    private val dailyDataList = ArrayList<DailyData>()

    private val rowModels = ArrayList<RowModel>()

    override val itemCount: Int
        get() = rowModels.size

    /**
     * The presenter sets the view holder and hence we can write Unit Tests for the below logic since it does not depend on Android framework
     */
    override fun onBindViewHolderAtPosition(holder: BaseViewHolder, position: Int) {
        when (getItemViewType(position)) {
            TODAY_SUMMARY.value -> {
                val todaysSummaryViewHolder = holder as TodaysSummaryViewHolder
                val todaysSummary = rowModels[position].todayWeather
                todaysSummaryViewHolder.setTodaysSummary(todaysSummary?.summary!!)
                todaysSummaryViewHolder.setTemperature(todaysSummary.temperature.toString() + " F")
                todaysSummaryViewHolder.setWindSpeed(todaysSummary.windSpeed.toString() + " MPH")
                todaysSummaryViewHolder.setHumidity(todaysSummary.humidity.toString())
                todaysSummaryViewHolder.setPressure(todaysSummary.pressure.toString())
            }

            ROW_HEADER.value -> {
                val forecastHeaderViewHolder = holder as ForecastHeaderViewHolder
                val forecastHeader = rowModels[position].rowHeader
                forecastHeaderViewHolder.setForecastDate(formatDateToDisplay(forecastHeader?.headerDate!!))
            }

            ROW_DATA.value -> {
                val forecastDetailsViewHolder = holder as ForecastDataViewHolder
                val forecastData = rowModels[position].dailyData
                forecastDetailsViewHolder.setTemperature(forecastData?.temperatureMin.toString() + " F")
                forecastDetailsViewHolder.setWindSpeed(forecastData?.windSpeed.toString() + " MPH")
                forecastDetailsViewHolder.setHumidity(forecastData?.humidity.toString())
                forecastDetailsViewHolder.setPressure(forecastData?.pressure.toString())
            }

            else -> throw IllegalArgumentException("Invalid view type received exception")
        }
    }

    /**
     * This method loads data from the Server
     */
    override fun getWeatherDetails() {

        if (isViewAttached) {
            mainView!!.showLoading()
        }

        disposables.add(weatherForecastApi.accountDetails
                .subscribeOn(schedulersProvider.io())
                .observeOn(schedulersProvider.mainUiThread())
                .subscribeWith(object : DisposableSingleObserver<WeatherData>() {

                    override fun onSuccess(response: WeatherData) {

                        currentWeatherData = response.currently!!

                        rowModels.clear()
                        dailyDataList.clear()
                        dailyDataList.addAll(response.daily!!.data!!)

                        //insert current weather to the list
                        rowModels.add(RowModel(response.currently!!, Helper.RowType.TODAY_SUMMARY))

                        //insert daily forecast with row header
                        for (item: DailyData in response.daily!!.data!!) {
                            rowModels.add(RowModel(Date(item.time!! * 1000), Helper.RowType.ROW_HEADER))
                            rowModels.add(RowModel(item, Helper.RowType.ROW_DATA))
                        }

                        //update view with the latest data
                        if (isViewAttached) {
                            mainView!!.hideLoading()
                            mainView!!.updateView()
                            mainView!!.setCouldNotLoadLayoutVisibility(false)
                        }
                    }

                    override fun onError(e: Throwable) {
                        if (isViewAttached) {
                            mainView!!.hideLoading()
                            mainView!!.setCouldNotLoadLayoutVisibility(true)
                        }
                    }
                }))
    }

    override fun attachView(view: WeatherForecastContract.View) {
        mainView = view
        getWeatherDetails()
    }

    override fun detachView() {
        mainView = null
    }

    override fun clearDisposables() {
        disposables.clear()
    }

    override fun getItemViewType(position: Int): Int {
        return rowModels[position].rowType.value
    }

    private val isViewAttached: Boolean
        get() = mainView != null
}
