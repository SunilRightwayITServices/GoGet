package com.au.rightway.weatherforecast.networking


import com.au.rightway.weatherforecast.networking.responsemodels.WeatherData
import io.reactivex.Single
import retrofit2.http.GET

/**
 * The interface for the Retrofit. Since we have integrated RxJava with Retro, we can return Observables
*/

interface WeatherForecastApi {

    @get:GET("-33.8650,151.2094")
    val accountDetails: Single<WeatherData>
}