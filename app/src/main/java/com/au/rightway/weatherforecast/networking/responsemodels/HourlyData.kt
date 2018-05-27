package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HourlyData : Parcelable {

    @SerializedName("time")
    @Expose
    var time: Int? = null
    @SerializedName("summary")
    @Expose
    var summary: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null
    @SerializedName("precipIntensity")
    @Expose
    var precipIntensity: Double? = null
    @SerializedName("precipProbability")
    @Expose
    var precipProbability: Double? = null
    @SerializedName("temperature")
    @Expose
    var temperature: Double? = null
    @SerializedName("apparentTemperature")
    @Expose
    var apparentTemperature: Double? = null
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
    @SerializedName("windBearing")
    @Expose
    var windBearing: Double? = null
    @SerializedName("cloudCover")
    @Expose
    var cloudCover: Double? = null
    @SerializedName("uvIndex")
    @Expose
    var uvIndex: Double? = null
    @SerializedName("visibility")
    @Expose
    var visibility: Double? = null
    @SerializedName("ozone")
    @Expose
    var ozone: Double? = null
    @SerializedName("precipType")
    @Expose
    var precipType: String? = null

    protected constructor(`in`: Parcel) {
        this.time = `in`.readValue(Int::class.java.classLoader) as Int
        this.summary = `in`.readValue(String::class.java.classLoader) as String
        this.icon = `in`.readValue(String::class.java.classLoader) as String
        this.precipIntensity = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipProbability = `in`.readValue(Double::class.java.classLoader) as Double
        this.temperature = `in`.readValue(Double::class.java.classLoader) as Double
        this.apparentTemperature = `in`.readValue(Double::class.java.classLoader) as Double
        this.dewPoint = `in`.readValue(Double::class.java.classLoader) as Double
        this.humidity = `in`.readValue(Double::class.java.classLoader) as Double
        this.pressure = `in`.readValue(Double::class.java.classLoader) as Double
        this.windSpeed = `in`.readValue(Double::class.java.classLoader) as Double
        this.windGust = `in`.readValue(Double::class.java.classLoader) as Double
        this.windBearing = `in`.readValue(Double::class.java.classLoader) as Double
        this.cloudCover = `in`.readValue(Double::class.java.classLoader) as Double
        this.uvIndex = `in`.readValue(Double::class.java.classLoader) as Double
        this.visibility = `in`.readValue(Double::class.java.classLoader) as Double
        this.ozone = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipType = `in`.readValue(String::class.java.classLoader) as String
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(time)
        dest.writeValue(summary)
        dest.writeValue(icon)
        dest.writeValue(precipIntensity)
        dest.writeValue(precipProbability)
        dest.writeValue(temperature)
        dest.writeValue(apparentTemperature)
        dest.writeValue(dewPoint)
        dest.writeValue(humidity)
        dest.writeValue(pressure)
        dest.writeValue(windSpeed)
        dest.writeValue(windGust)
        dest.writeValue(windBearing)
        dest.writeValue(cloudCover)
        dest.writeValue(uvIndex)
        dest.writeValue(visibility)
        dest.writeValue(ozone)
        dest.writeValue(precipType)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<HourlyData> = object : Parcelable.Creator<HourlyData> {


            override fun createFromParcel(`in`: Parcel): HourlyData {
                return HourlyData(`in`)
            }

            override fun newArray(size: Int): Array<HourlyData?> {
                return arrayOfNulls(size)
            }

        }
    }

}