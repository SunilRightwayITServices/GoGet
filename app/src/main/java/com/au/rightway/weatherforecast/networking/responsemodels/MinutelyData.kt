package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MinutelyData : Parcelable {

    @SerializedName("time")
    @Expose
    var time: Int? = null
    @SerializedName("precipIntensity")
    @Expose
    var precipIntensity: Double? = null
    @SerializedName("precipProbability")
    @Expose
    var precipProbability: Double? = null
    @SerializedName("precipIntensityError")
    @Expose
    var precipIntensityError: Double? = null
    @SerializedName("precipType")
    @Expose
    var precipType: String? = null

    protected constructor(`in`: Parcel) {
        this.time = `in`.readValue(Int::class.java.classLoader) as Int
        this.precipIntensity = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipProbability = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipIntensityError = `in`.readValue(Double::class.java.classLoader) as Double
        this.precipType = `in`.readValue(String::class.java.classLoader) as String
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(time)
        dest.writeValue(precipIntensity)
        dest.writeValue(precipProbability)
        dest.writeValue(precipIntensityError)
        dest.writeValue(precipType)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<MinutelyData> = object : Parcelable.Creator<MinutelyData> {


            override fun createFromParcel(`in`: Parcel): MinutelyData {
                return MinutelyData(`in`)
            }

            override fun newArray(size: Int): Array<MinutelyData?> {
                return arrayOfNulls(size)
            }

        }
    }

}