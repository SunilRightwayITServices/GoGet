package com.au.rightway.weatherforecast.modules.forecast

/**
 * We are using MVP and hence we need to define contract that views and presenters adhere to
 * We have also defined contract for our view holders
 */

interface WeatherForecastContract {

    interface View {

        fun updateView()

        fun showLoading()

        fun hideLoading()

        fun setCouldNotLoadLayoutVisibility(showCouldNotLoadLayout: Boolean)
    }

    interface Presenter {

        val itemCount: Int

        fun onBindViewHolderAtPosition(holder: BaseViewHolder, position: Int)

        fun getWeatherDetails()

        fun attachView(view: View)

        fun detachView()

        fun clearDisposables()

        fun getItemViewType(position: Int): Int
    }

    //We need a base view holder to use in our RecyclerView Adapter. This will allow us to display different views in the same RecyclerView.
    interface BaseViewHolder

    interface TodaysSummaryViewHolder : BaseViewHolder {

        fun setTodaysSummary(todaysSummary: String)

        fun setTemperature(temperature: String)

        fun setWindSpeed(windSpeed: String)

        fun setHumidity(humidity: String)

        fun setPressure(pressure: String)
    }

    interface ForecastDataViewHolder : BaseViewHolder {

        fun setTemperature(temperature: String)

        fun setWindSpeed(windSpeed: String)

        fun setHumidity(humidity: String)

        fun setPressure(pressure: String)
    }

    interface ForecastHeaderViewHolder : BaseViewHolder {

        fun setForecastDate(forecastDate: String)
    }
}
