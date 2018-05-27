package com.au.rightway.weatherforecast.modules.forecast

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.au.rightway.weatherforecast.weatherforecastApplication
import com.au.rightway.weatherforecast.R
import javax.inject.Inject

/**
 * Fragment to display Recycler View
 */

class WeatherForecastFragment : Fragment(), WeatherForecastContract.View {

    @BindView(R.id.swipe_container)
    lateinit var swipeContainer: SwipeRefreshLayout

    @BindView(R.id.recycler_view)
    lateinit var recyclerView: RecyclerView

    @BindView(R.id.error_loading_layout)
    lateinit var errorLoadingLayout: View

    private var adapter: WeatherForecastAdapter? = null

    private var progress: ProgressDialog? = null

    @Inject
    lateinit var presenter: WeatherForecastContract.Presenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_weather, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ButterKnife.bind(this, view!!)

        //inject our presenter here
        weatherforecastApplication.instance!!.activityComponents.inject(this)

        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        adapter = WeatherForecastAdapter(presenter)
        recyclerView.adapter = adapter

        swipeContainer.setOnRefreshListener { presenter.getWeatherDetails() }
    }

    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.detachView()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.clearDisposables()
    }

    override fun updateView() {
        adapter!!.notifyDataSetChanged()
    }

    override fun showLoading() {
        if (progress == null) {
            progress = ProgressDialog(context)
            progress!!.setTitle(resources.getString(R.string.loading_title))
            progress!!.setMessage(resources.getString(R.string.loading_message))
        }
        if (!progress!!.isShowing) {
            progress!!.show()
        }
    }

    override fun hideLoading() {
        swipeContainer.isRefreshing = false
        if (progress != null && progress!!.isShowing) {
            progress!!.dismiss()
        }
    }

    override fun setCouldNotLoadLayoutVisibility(showCouldNotLoadLayout: Boolean) {
        if (showCouldNotLoadLayout) {
            errorLoadingLayout.visibility = VISIBLE
            swipeContainer.visibility = GONE
        } else {
            swipeContainer.visibility = VISIBLE
            errorLoadingLayout.visibility = GONE
        }
    }

    @OnClick(R.id.try_again_button)
    fun onTryAgain() {
        presenter.getWeatherDetails()
    }

    companion object {
        val TAG = "weather_reports_fragment_tag"
    }
}
