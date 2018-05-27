package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Hourly : Parcelable {

    @SerializedName("summary")
    @Expose
    var summary: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null
    @SerializedName("data")
    @Expose
    var data: List<HourlyData>? = null

    protected constructor(`in`: Parcel) {
        this.summary = `in`.readValue(String::class.java.classLoader) as String
        this.icon = `in`.readValue(String::class.java.classLoader) as String
        `in`.readList(this.data, HourlyData::class.java.classLoader)
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(summary)
        dest.writeValue(icon)
        dest.writeList(data)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Hourly> = object : Parcelable.Creator<Hourly> {


            override fun createFromParcel(`in`: Parcel): Hourly {
                return Hourly(`in`)
            }

            override fun newArray(size: Int): Array<Hourly?> {
                return arrayOfNulls(size)
            }

        }
    }

}