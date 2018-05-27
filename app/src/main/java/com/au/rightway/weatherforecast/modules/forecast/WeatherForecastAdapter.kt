package com.au.rightway.weatherforecast.modules.forecast


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.au.rightway.weatherforecast.R
import com.au.rightway.weatherforecast.modules.forecast.viewholders.TodaysSummaryViewHolder
import com.au.rightway.weatherforecast.modules.forecast.viewholders.ForecastDetailsViewHolder
import com.au.rightway.weatherforecast.modules.forecast.viewholders.ForecastHeaderViewHolder
import com.au.rightway.weatherforecast.utils.Helper.RowType.*

class WeatherForecastAdapter(private val mPresenter: WeatherForecastContract.Presenter?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mClickListener = object : ForecastDetailsViewHolder.ClickListener {
        override fun onClick(position: Int) {
            //show pop up to display something
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TODAY_SUMMARY.value -> {
                val acountSummaryView = LayoutInflater.from(parent.context).inflate(R.layout.item_todays_weather, parent, false)
                return TodaysSummaryViewHolder(acountSummaryView)
            }

            ROW_HEADER.value -> {
                val headerView = LayoutInflater.from(parent.context).inflate(R.layout.item_weather_header, parent, false)
                return ForecastHeaderViewHolder(headerView)
            }

            ROW_DATA.value -> {
                val detailsView = LayoutInflater.from(parent.context).inflate(R.layout.item_weather_details, parent, false)
                return ForecastDetailsViewHolder(detailsView, mClickListener)
            }

            else -> throw IllegalArgumentException("Invalid view type received exception")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //We want the data to be handled by the presenter using the view holder contract
        //this will also allow us to unit test the data being set to view holder
        mPresenter?.onBindViewHolderAtPosition(holder as WeatherForecastContract.BaseViewHolder, position)
    }

    override fun getItemCount(): Int {
        return mPresenter?.itemCount!!
    }

    override fun getItemViewType(position: Int): Int {
        return mPresenter?.getItemViewType(position)!!
    }
}
