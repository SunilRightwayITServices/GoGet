package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Minutely : Parcelable {

    @SerializedName("summary")
    @Expose
    var summary: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null
    @SerializedName("data")
    @Expose
    var data: List<MinutelyData>? = null

    protected constructor(`in`: Parcel) {
        this.summary = `in`.readValue(String::class.java.classLoader) as String
        this.icon = `in`.readValue(String::class.java.classLoader) as String
        `in`.readList(this.data, MinutelyData::class.java.classLoader)
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
        val CREATOR: Parcelable.Creator<Minutely> = object : Parcelable.Creator<Minutely> {


            override fun createFromParcel(`in`: Parcel): Minutely {
                return Minutely(`in`)
            }

            override fun newArray(size: Int): Array<Minutely?> {
                return arrayOfNulls(size)
            }

        }
    }

}