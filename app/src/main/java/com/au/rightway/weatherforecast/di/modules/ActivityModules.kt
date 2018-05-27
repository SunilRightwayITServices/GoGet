package com.au.rightway.weatherforecast.di.modules

import com.au.rightway.weatherforecast.di.components.PerActivity
import com.au.rightway.weatherforecast.modules.mainactivity.MainAcivityContract
import com.au.rightway.weatherforecast.modules.mainactivity.MainActivityPresenter
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastPresenter
import com.au.rightway.weatherforecast.networking.WeatherForecastApi
import com.au.rightway.weatherforecast.utils.SchedulersProvider

import dagger.Module
import dagger.Provides

@Module
class ActivityModules {

    @Provides
    @PerActivity
    fun provideMainActivityPresenter(): MainAcivityContract.Presenter {
        return MainActivityPresenter()
    }

    @Provides
    @PerActivity
    fun getWeatherForecastPresenter(weatherforecastApi: WeatherForecastApi, schedulersProvider: SchedulersProvider): WeatherForecastContract.Presenter {
        return WeatherForecastPresenter(weatherforecastApi, schedulersProvider)
    }
}
