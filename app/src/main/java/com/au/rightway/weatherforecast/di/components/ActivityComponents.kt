package com.au.rightway.weatherforecast.di.components

import com.au.rightway.weatherforecast.di.modules.ActivityModules
import com.au.rightway.weatherforecast.modules.mainactivity.MainActivity
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastFragment

import dagger.Component

@PerActivity
@Component(dependencies = arrayOf(SupportComponents::class), modules = arrayOf(ActivityModules::class))
interface ActivityComponents {

    fun inject(activity: MainActivity)

    fun inject(fragment: WeatherForecastFragment)
}