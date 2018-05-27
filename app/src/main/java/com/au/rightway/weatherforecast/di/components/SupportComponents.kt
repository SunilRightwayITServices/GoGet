package com.au.rightway.weatherforecast.di.components

import com.au.rightway.weatherforecast.di.modules.SupportModules
import com.au.rightway.weatherforecast.networking.WeatherForecastApi
import com.au.rightway.weatherforecast.utils.SchedulersProvider
import com.google.gson.Gson
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(SupportModules::class))
interface SupportComponents {

    val weatherforecastApi: WeatherForecastApi

    val gson: Gson

    val schedulersProvider: SchedulersProvider
}
