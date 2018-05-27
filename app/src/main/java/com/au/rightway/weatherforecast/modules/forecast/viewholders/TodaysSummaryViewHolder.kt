package com.au.rightway.weatherforecast.modules.forecast.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.au.rightway.weatherforecast.R
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract

/**
 * View holder for our Account Summary that is displayed as the first row in the recycler view
 */

class TodaysSummaryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), WeatherForecastContract.TodaysSummaryViewHolder {

    @BindView(R.id.today_summary_text_view)
    lateinit var todaySummaryTextView: TextView

    @BindView(R.id.temperature_summary_text_view)
    lateinit var temperatureSummaryTextView: TextView

    @BindView(R.id.wind_speed_summary_text_view)
    lateinit var windSpeedSummaryTextView: TextView

    @BindView(R.id.humidity_summary_text_view)
    lateinit var humiditySummaryTextView: TextView

    @BindView(R.id.pressure_summary_text_view)
    lateinit var pressureSummaryTextView: TextView

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun setTodaysSummary(summary: String) {
        todaySummaryTextView.text = summary
    }

    override fun setTemperature(temperature: String) {
        temperatureSummaryTextView.text = temperature
    }

    override fun setWindSpeed(windspeed: String) {
        windSpeedSummaryTextView.text = windspeed
    }

    override fun setPressure(pressure: String) {
        pressureSummaryTextView.text = pressure
    }

    override fun setHumidity(humidity: String) {
        humiditySummaryTextView.text = humidity
    }
}
