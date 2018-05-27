package com.au.rightway.weatherforecast.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Any methods and variables used throughout the app needs to be defined here.
 * In large projects, we further split the Helper into various objects based on the functionalities
 */

object Helper {

    val DARKSKY_API_KEY = "b9e5d3279be62822451e3db8c6292d7b"

    private val DATE_FORMAT_TO_DISPLAY = "dd MMM yyyy"

    fun formatDateToDisplay(date: Date): String {
        return SimpleDateFormat(DATE_FORMAT_TO_DISPLAY, Locale.UK).format(date).toUpperCase()
    }

    enum class RowType(val value: Int) {
        TODAY_SUMMARY(0),
        ROW_HEADER(1),
        ROW_DATA(2)
    }
}