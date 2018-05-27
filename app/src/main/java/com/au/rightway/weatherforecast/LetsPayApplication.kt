package com.au.rightway.weatherforecast

import android.app.Application

import com.au.rightway.weatherforecast.di.components.ActivityComponents
import com.au.rightway.weatherforecast.di.components.DaggerActivityComponents
import com.au.rightway.weatherforecast.di.components.DaggerSupportComponents
import com.au.rightway.weatherforecast.di.modules.ActivityModules
import com.au.rightway.weatherforecast.di.modules.SupportModules
import com.au.rightway.weatherforecast.utils.Helper.DARKSKY_API_KEY


class weatherforecastApplication : Application() {

    val baseURL = "https://api.darksky.net/forecast/" + DARKSKY_API_KEY + "/";
    private var mActivityComponents: ActivityComponents? = null

    val activityComponents: ActivityComponents
        get() {
            if (mActivityComponents == null) {
                val supportComponents = DaggerSupportComponents.builder().supportModules(SupportModules(this)).build()

                mActivityComponents = DaggerActivityComponents.builder().supportComponents(supportComponents)
                        .activityModules(ActivityModules())
                        .build()
            }

            return mActivityComponents!!
        }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: weatherforecastApplication? = null
            private set
    }

}
