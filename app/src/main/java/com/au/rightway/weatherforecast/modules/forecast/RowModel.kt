package com.au.rightway.weatherforecast.modules.forecast

import com.au.rightway.weatherforecast.networking.responsemodels.Currently
import com.au.rightway.weatherforecast.networking.responsemodels.DailyData
import com.au.rightway.weatherforecast.utils.Helper
import com.au.rightway.weatherforecast.utils.Helper.RowType
import java.util.*

class RowModel {

    var rowType: RowType

    var todayWeather: Currently? = null

    var rowHeader: RowHeader? = null

    var dailyData: DailyData? = null

    constructor(accountSummary: Currently, viewType: Helper.RowType) {
        this.todayWeather = accountSummary
        this.rowType = viewType
    }

    constructor(forecastDate: Date, viewType: RowType) {
        rowHeader = RowHeader(forecastDate)
        this.rowType = viewType
    }

    constructor(data: DailyData, viewType: RowType) {
        this.dailyData = data
        this.rowType = viewType
    }

    class RowHeader(val headerDate: Date)
}
