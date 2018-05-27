package com.au.rightway.weatherforecast.modules.forecast.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.au.rightway.weatherforecast.R
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract

/**
 * View holder for our Header.
 */

class ForecastHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), WeatherForecastContract.ForecastHeaderViewHolder {


    @BindView(R.id.forecast_date_text_view)
    lateinit var forecastDateTextView: TextView

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun setForecastDate(forecastDate: String) {
        forecastDateTextView.text = forecastDate
    }
}
