package com.au.rightway.weatherforecast.modules.forecast

import com.au.rightway.weatherforecast.networking.responsemodels.Currently
import com.au.rightway.weatherforecast.networking.responsemodels.Daily
import com.au.rightway.weatherforecast.networking.responsemodels.DailyData
import com.au.rightway.weatherforecast.networking.responsemodels.WeatherData
import com.au.rightway.weatherforecast.networking.WeatherForecastApi
import com.au.rightway.weatherforecast.testutils.TestSchedulersProvider
import com.au.rightway.weatherforecast.utils.Helper
import io.reactivex.Single
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations.initMocks
import kotlin.collections.ArrayList

/**
 * Units tests to cover as much as possible behaviours of our Weather Presenter
 * All the method names are self explanatory
 */

class WeatherForecastPresenterTest {

    @Mock
    private lateinit var view: WeatherForecastContract.View

    @Mock
    private lateinit var weatherforecastApi: WeatherForecastApi

    private lateinit var presenter: WeatherForecastPresenter

    @Before
    fun setup() {
        initMocks(this)

        Mockito.`when`(weatherforecastApi.accountDetails).thenReturn(Single.just(getServerResponse()))

        presenter = WeatherForecastPresenter(weatherforecastApi, TestSchedulersProvider())
    }

    @Test
    fun showLoadingWhenLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).showLoading()
    }

    @Test
    fun hideLoadingAfterSuccessOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).hideLoading()
    }

    @Test
    fun updateWeathersOnSuccessOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).updateView()
    }

    @Test
    fun hideLoadLayoutOnSuccessOnLoadingDetails() {
        //when
        presenter.attachView(view)

        //then
        verify(view).setCouldNotLoadLayoutVisibility(false)
    }

    @Test
    fun hideLoadingAfterErrorOnLoadingDetails() {
        //given
        Mockito.`when`(weatherforecastApi.accountDetails).thenReturn(Single.error(Exception()))
        presenter = WeatherForecastPresenter(weatherforecastApi, TestSchedulersProvider())

        //when
        presenter.attachView(view)

        //then
        verify(view).hideLoading()
    }

    @Test
    fun verifyForecastRowModelsData() {
        //when
        presenter.attachView(view)

        //then
        assertTrue(presenter.getItemViewType(0) == Helper.RowType.TODAY_SUMMARY.value)
        assertTrue(presenter.getItemViewType(1) == Helper.RowType.ROW_HEADER.value)
        assertTrue(presenter.getItemViewType(2) == Helper.RowType.ROW_DATA.value)
    }

    @Test
    fun showCouldNotLoadLayoutOnError() {
        //given
        Mockito.`when`(weatherforecastApi.accountDetails).thenReturn(Single.error(Exception()))
        presenter = WeatherForecastPresenter(weatherforecastApi, TestSchedulersProvider())

        //when
        presenter.attachView(view)

        //then
        verify(view).setCouldNotLoadLayoutVisibility(true)
    }

    @Test
    fun verifyWeatherHeaderViewHolderIsSet() {
        //given
        val headerViewHolder = mock(WeatherForecastContract.ForecastHeaderViewHolder::class.java)
        presenter.attachView(view)

        //when
        presenter.onBindViewHolderAtPosition(headerViewHolder, 1)

        //then
        verify(headerViewHolder).setForecastDate(anyString())
    }

    private fun getServerResponse(): WeatherData {
        val serverResponse = WeatherData()

        serverResponse.currently = Currently()
        serverResponse.currently?.time = 1527305575
        serverResponse.currently?.summary = "Sunny"
        serverResponse.currently?.temperature = 40.00
        serverResponse.currently?.windSpeed = 40.00
        serverResponse.currently?.pressure = 80.00
        serverResponse.currently?.humidity = 80.00

        val dailyDataList: ArrayList<DailyData> = ArrayList()
        var dailyData = DailyData()
        dailyData.time = 1527305575
        dailyData.summary = "summary"
        dailyData.temperatureMin = 40.90
        dailyData.windSpeed = 10.00
        dailyData.humidity = 20.00
        dailyData.pressure = 80.00

        serverResponse.daily = Daily()
        dailyDataList.add(dailyData)
        serverResponse.daily!!.data = dailyDataList

        return serverResponse
    }
}