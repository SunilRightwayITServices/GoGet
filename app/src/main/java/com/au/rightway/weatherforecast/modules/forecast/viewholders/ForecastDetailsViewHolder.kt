package com.au.rightway.weatherforecast.modules.forecast.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.au.rightway.weatherforecast.R
import com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract

/**
 * View holder for our Weather Details.
 */

class ForecastDetailsViewHolder(itemView: View, private val mClickListener: ClickListener?) : RecyclerView.ViewHolder(itemView), WeatherForecastContract.ForecastDataViewHolder {

    @BindView(R.id.temperature_text_view)
    lateinit var temperatureTextView: TextView

    @BindView(R.id.wind_speed_text_view)
    lateinit var windSpeedTextView: TextView

    @BindView(R.id.humidity_text_view)
    lateinit var humidityTextView: TextView

    @BindView(R.id.pressure_text_view)
    lateinit var pressureTextView: TextView

    interface ClickListener {
        fun onClick(position: Int)
    }

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun setTemperature(temperature: String) {
        temperatureTextView.text = temperature
    }

    override fun setWindSpeed(windSpeed: String) {
        windSpeedTextView.text = windSpeed
    }

    override fun setHumidity(humidity: String) {
        humidityTextView.text = humidity
    }

    override fun setPressure(pressure: String) {
        pressureTextView.text = pressure
    }

    @OnClick(R.id.weather_details_layout)
    fun onRowClicked() {
        mClickListener?.onClick(adapterPosition)
    }
}