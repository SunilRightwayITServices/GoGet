package com.au.rightway.weatherforecast.modules.mainactivity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

import com.au.rightway.weatherforecast.weatherforecastApplication
import com.au.rightway.weatherforecast.R
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastFragment

import javax.inject.Inject

/**
 * This activity acts as a container for hosting our fragments
 */

class MainActivity : AppCompatActivity(), MainAcivityContract.View {

    @Inject
    lateinit var presenter: MainAcivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //inject our presenter here
        weatherforecastApplication.instance!!.activityComponents.inject(this)

        loadFragment(WeatherForecastFragment(), WeatherForecastFragment.TAG)
    }

    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.detachView()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }

    private fun loadFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container_framelayout, fragment).addToBackStack(tag)
                .commit()
    }
}
