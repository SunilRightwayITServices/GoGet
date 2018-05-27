package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Daily : Parcelable {

    @SerializedName("summary")
    @Expose
    var summary: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null
    @SerializedName("data")
    @Expose
    var data: List<DailyData>? = null

    protected constructor(`in`: Parcel) {
        this.summary = `in`.readValue(String::class.java.classLoader) as String
        this.icon = `in`.readValue(String::class.java.classLoader) as String
        `in`.readList(this.data, DailyData::class.java.classLoader)
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
        val CREATOR: Parcelable.Creator<Daily> = object : Parcelable.Creator<Daily> {


            override fun createFromParcel(`in`: Parcel): Daily {
                return Daily(`in`)
            }

            override fun newArray(size: Int): Array<Daily?> {
                return arrayOfNulls(size)
            }

        }
    }

}