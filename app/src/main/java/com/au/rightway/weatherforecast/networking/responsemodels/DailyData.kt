package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class DailyData : Parcelable {

    @SerializedName("time")
    @Expose
    var time: Long? = null
    @SerializedName("summary")
    @Expose
    var summary: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null
    @SerializedName("sunriseTime")
    @Expose
    var sunriseTime: Int? = null
    @SerializedName("sunsetTime")
    @Expose
    var sunsetTime: Int? = null
    @SerializedName("moonPhase")
    @Expose
    var moonPhase: Double? = null
    @SerializedName("precipIntensity")
    @Expose
    var precipIntensity: Double? = null
    @SerializedName("precipIntensityMax")
    @Expose
    var precipIntensityMax: Double? = null
    @SerializedName("precipIntensityMaxTime")
    @Expose
    var precipIntensityMaxTime: Double? = null
    @SerializedName("precipProbability")
    @Expose
    var precipProbability: Double? = null
    @SerializedName("precipType")
    @Expose
    var precipType: String? = null
    @SerializedName("temperatureHigh")
    @Expose
    var temperatureHigh: Double? = null
    @SerializedName("temperatureHighTime")
    @Expose
    var temperatureHighTime: Double? = null
    @SerializedName("temperatureLow")
    @Expose
    var temperatureLow: Double? = null
    @SerializedName("temperatureLowTime")
    @Expose
    var temperatureLowTime: Double? = null
    @SerializedName("apparentTemperatureHigh")
    @Expose
    var apparentTemperatureHigh: Double? = null
    @SerializedName("apparentTemperatureHighTime")
    @Expose
    var apparentTemperatureHighTime: Double? = null
    @SerializedName("apparentTemperatureLow")
    @Expose
    var apparentTemperatureLow: Double? = null
    @SerializedName("apparentTemperatureLowTime")
    @Expose
    var apparentTemperatureLowTime: Double? = null
    @SerializedName("dewPoint")
    @Expose
    var dewPoint: Double? = null
    @SerializedName("humidity")
    @Expose
    var humidity: Double? = null
    @SerializedName("pressure")
    @Expose
    var pressure: Double? = null
    @SerializedName("windSpeed")
    @Expose
    var windSpeed: Double? = null
    @SerializedName("windGust")
    @Expose
    var windGust: Double? = null
    @SerializedName("windGustTime")
    @Expose
    var windGustTime: Int? = null
    @SerializedName("windBearing")
    @Expose
    var windBearing: Int? = null
    @SerializedName("cloudCover")
    @Expose
    var cloudCover: Double? = null
    @SerializedName("uvIndex")
    @Expose
    var uvIndex: Int? = null
    @SerializedName("uvIndexTime")
    @Expose
    var uvIndexTime: Int? = null
    @SerializedName("visibility")
    @Expose
    var visibility: Double? = null
    @SerializedName("ozone")
    @Expose
    var ozone: Double? = null
    @SerializedName("temperatureMin")
    @Expose
    var temperatureMin: Double? = null
    @SerializedName("temperatureMinTime")
    @Expose
    var temperatureMinTime: Double? = null
    @SerializedName("temperatureMax")
    @Expose
    var temperatureMax: Double? = null
    @SerializedName("temperatureMaxTime")
    @Expose
    var temperatureMaxTime: Double? = null
    @SerializedName("apparentTemperatureMin")
    @Expose
    var apparentTemperatureMin: Double? = null
    @SerializedName("apparentTemperatureMinTime")
    @Expose
    var apparentTemperatureMinTime: Int? = null
    @SerializedName("apparentTemperatureMax")
    @Expose
    var apparentTemperatureMax: Double? = null
    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    var apparentTemperatureMaxTime: Double? = null

    protected constructor(`in`: Parcel) {
        this.time = `in`.readValue(Long::class.java.classLoader) as Long
        this.summary = `in`.readValue(String::class.java.classLoader) as String
        this.icon = `in`.readValue(String::class.java.classLoader) as String
        this.sunriseTime = `in`.readValue(Int::class.java.classLoader) as Int
        this.sunsetTime = `in`.readValue(Int::class.java.classLoader) as Int
        this.moonPhase = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipIntensity = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipIntensityMax = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipIntensityMaxTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipProbability = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipType = `in`.readValue(String::class.java.classLoader) as String
        this.temperatureHigh = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureHighTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureLow = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureLowTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureHigh = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureHighTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureLow = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureLowTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.dewPoint = `in`.readValue(Double::class.java.classLoader) as Double
        this.humidity = `in`.readValue(Double::class.java.classLoader) as Double
        this.pressure = `in`.readValue(Double::class.java.classLoader) as Double
        this.windSpeed = `in`.readValue(Double::class.java.classLoader) as Double
        this.windGust = `in`.readValue(Double::class.java.classLoader) as Double
        this.windGustTime = `in`.readValue(Int::class.java.classLoader) as Int
        this.windBearing = `in`.readValue(Int::class.java.classLoader) as Int
        this.cloudCover = `in`.readValue(Double::class.java.classLoader) as Double
        this.uvIndex = `in`.readValue(Int::class.java.classLoader) as Int
        this.uvIndexTime = `in`.readValue(Int::class.java.classLoader) as Int
        this.visibility = `in`.readValue(Double::class.java.classLoader) as Double
        this.ozone = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureMin = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureMinTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureMax = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperatureMaxTime = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureMin = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureMinTime = `in`.readValue(Int::class.java.classLoader) as Int
        this.apparentTemperatureMax = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperatureMaxTime = `in`.readValue(Double::class.java.classLoader) as Double
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(time)
        dest.writeValue(summary)
        dest.writeValue(icon)
        dest.writeValue(sunriseTime)
        dest.writeValue(sunsetTime)
        dest.writeValue(moonPhase)
        dest.writeValue(precipIntensity)
        dest.writeValue(precipIntensityMax)
        dest.writeValue(precipIntensityMaxTime)
        dest.writeValue(precipProbability)
        dest.writeValue(precipType)
        dest.writeValue(temperatureHigh)
        dest.writeValue(temperatureHighTime)
        dest.writeValue(temperatureLow)
        dest.writeValue(temperatureLowTime)
        dest.writeValue(apparentTemperatureHigh)
        dest.writeValue(apparentTemperatureHighTime)
        dest.writeValue(apparentTemperatureLow)
        dest.writeValue(apparentTemperatureLowTime)
        dest.writeValue(dewPoint)
        dest.writeValue(humidity)
        dest.writeValue(pressure)
        dest.writeValue(windSpeed)
        dest.writeValue(windGust)
        dest.writeValue(windGustTime)
        dest.writeValue(windBearing)
        dest.writeValue(cloudCover)
        dest.writeValue(uvIndex)
        dest.writeValue(uvIndexTime)
        dest.writeValue(visibility)
        dest.writeValue(ozone)
        dest.writeValue(temperatureMin)
        dest.writeValue(temperatureMinTime)
        dest.writeValue(temperatureMax)
        dest.writeValue(temperatureMaxTime)
        dest.writeValue(apparentTemperatureMin)
        dest.writeValue(apparentTemperatureMinTime)
        dest.writeValue(apparentTemperatureMax)
        dest.writeValue(apparentTemperatureMaxTime)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<DailyData> = object : Parcelable.Creator<DailyData> {


            override fun createFromParcel(`in`: Parcel): DailyData {
                return DailyData(`in`)
            }

            override fun newArray(size: Int): Array<DailyData?> {
                return arrayOfNulls(size)
            }

        }
    }

}