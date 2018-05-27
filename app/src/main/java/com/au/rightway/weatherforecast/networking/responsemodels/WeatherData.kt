package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WeatherData : Parcelable {

    @SerializedName("latitude")
    @Expose
    var latitude: Double? = null
    @SerializedName("longitude")
    @Expose
    var longitude: Double? = null
    @SerializedName("timezone")
    @Expose
    var timezone: String? = null
    @SerializedName("currently")
    @Expose
    var currently: Currently? = null
    @SerializedName("minutely")
    @Expose
    var minutely: Minutely? = null
    @SerializedName("hourly")
    @Expose
    var hourly: Hourly? = null
    @SerializedName("daily")
    @Expose
    var daily: Daily? = null
    @SerializedName("flags")
    @Expose
    var flags: Flags? = null
    @SerializedName("offset")
    @Expose
    var offset: Int? = null

    protected constructor(`in`: Parcel) {
        this.latitude = `in`.readValue(Double::class.java.classLoader) as Double
        this.longitude = `in`.readValue(Double::class.java.classLoader) as Double
        this.timezone = `in`.readValue(String::class.java.classLoader) as String
        this.currently = `in`.readValue(Currently::class.java.classLoader) as Currently
        this.minutely = `in`.readValue(Minutely::class.java.classLoader) as Minutely
        this.hourly = `in`.readValue(Hourly::class.java.classLoader) as Hourly
        this.daily = `in`.readValue(Daily::class.java.classLoader) as Daily
        this.flags = `in`.readValue(Flags::class.java.classLoader) as Flags
        this.offset = `in`.readValue(Int::class.java.classLoader) as Int
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(latitude)
        dest.writeValue(longitude)
        dest.writeValue(timezone)
        dest.writeValue(currently)
        dest.writeValue(minutely)
        dest.writeValue(hourly)
        dest.writeValue(daily)
        dest.writeValue(flags)
        dest.writeValue(offset)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<WeatherData> = object : Parcelable.Creator<WeatherData> {


            override fun createFromParcel(`in`: Parcel): WeatherData {
                return WeatherData(`in`)
            }

            override fun newArray(size: Int): Array<WeatherData?> {
                return arrayOfNulls(size)
            }

        }
    }

}