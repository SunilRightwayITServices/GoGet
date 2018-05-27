package com.au.rightway.weatherforecast.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Flags : Parcelable {

    @SerializedName("sources")
    @Expose
    var sources: List<String>? = null
    @SerializedName("isd-stations")
    @Expose
    var isdStations: List<String>? = null
    @SerializedName("units")
    @Expose
    var units: String? = null

    protected constructor(`in`: Parcel) {
        `in`.readList(this.sources, java.lang.String::class.java.classLoader)
        `in`.readList(this.isdStations, java.lang.String::class.java.classLoader)
        this.units = `in`.readValue(String::class.java.classLoader) as String
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeList(sources)
        dest.writeList(isdStations)
        dest.writeValue(units)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Flags> = object : Parcelable.Creator<Flags> {


            override fun createFromParcel(`in`: Parcel): Flags {
                return Flags(`in`)
            }

            override fun newArray(size: Int): Array<Flags?> {
                return arrayOfNulls(size)
            }

        }
    }

}