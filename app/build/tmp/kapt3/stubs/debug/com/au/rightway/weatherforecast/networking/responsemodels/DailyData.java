package com.au.rightway.weatherforecast.networking.responsemodels;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b>\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u000f\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u008a\u0001\u001a\u00020 H\u0016J\u001c\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u008e\u0001\u001a\u00020 H\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\"\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\'\u0010\t\"\u0004\b(\u0010\u000bR\"\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\"\u0010,\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR \u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR\"\u00108\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR\"\u0010;\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR\"\u0010>\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b?\u0010\t\"\u0004\b@\u0010\u000bR\"\u0010A\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000bR\"\u0010D\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bE\u0010\t\"\u0004\bF\u0010\u000bR \u0010G\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00102\"\u0004\bI\u00104R\"\u0010J\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bK\u0010\t\"\u0004\bL\u0010\u000bR \u0010M\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u00102\"\u0004\bO\u00104R\"\u0010P\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010$R\"\u0010S\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bT\u0010\"\"\u0004\bU\u0010$R\"\u0010V\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bW\u0010\t\"\u0004\bX\u0010\u000bR\"\u0010Y\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bZ\u0010\t\"\u0004\b[\u0010\u000bR\"\u0010\\\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b]\u0010\t\"\u0004\b^\u0010\u000bR\"\u0010_\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b`\u0010\t\"\u0004\ba\u0010\u000bR\"\u0010b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bc\u0010\t\"\u0004\bd\u0010\u000bR\"\u0010e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bf\u0010\t\"\u0004\bg\u0010\u000bR\"\u0010h\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bi\u0010\t\"\u0004\bj\u0010\u000bR\"\u0010k\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bl\u0010\t\"\u0004\bm\u0010\u000bR\"\u0010n\u001a\u0004\u0018\u00010o8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010t\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010u\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bv\u0010\"\"\u0004\bw\u0010$R\"\u0010x\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\by\u0010\"\"\u0004\bz\u0010$R\"\u0010{\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b|\u0010\t\"\u0004\b}\u0010\u000bR#\u0010~\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0011\n\u0002\u0010%\u001a\u0004\b\u007f\u0010\"\"\u0005\b\u0080\u0001\u0010$R%\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\f\u001a\u0005\b\u0082\u0001\u0010\t\"\u0005\b\u0083\u0001\u0010\u000bR%\u0010\u0084\u0001\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010%\u001a\u0005\b\u0085\u0001\u0010\"\"\u0005\b\u0086\u0001\u0010$R%\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\f\u001a\u0005\b\u0088\u0001\u0010\t\"\u0005\b\u0089\u0001\u0010\u000b\u00a8\u0006\u0090\u0001"}, d2 = {"Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;", "Landroid/os/Parcelable;", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "apparentTemperatureHigh", "", "getApparentTemperatureHigh", "()Ljava/lang/Double;", "setApparentTemperatureHigh", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "apparentTemperatureHighTime", "getApparentTemperatureHighTime", "setApparentTemperatureHighTime", "apparentTemperatureLow", "getApparentTemperatureLow", "setApparentTemperatureLow", "apparentTemperatureLowTime", "getApparentTemperatureLowTime", "setApparentTemperatureLowTime", "apparentTemperatureMax", "getApparentTemperatureMax", "setApparentTemperatureMax", "apparentTemperatureMaxTime", "getApparentTemperatureMaxTime", "setApparentTemperatureMaxTime", "apparentTemperatureMin", "getApparentTemperatureMin", "setApparentTemperatureMin", "apparentTemperatureMinTime", "", "getApparentTemperatureMinTime", "()Ljava/lang/Integer;", "setApparentTemperatureMinTime", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "cloudCover", "getCloudCover", "setCloudCover", "dewPoint", "getDewPoint", "setDewPoint", "humidity", "getHumidity", "setHumidity", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "moonPhase", "getMoonPhase", "setMoonPhase", "ozone", "getOzone", "setOzone", "precipIntensity", "getPrecipIntensity", "setPrecipIntensity", "precipIntensityMax", "getPrecipIntensityMax", "setPrecipIntensityMax", "precipIntensityMaxTime", "getPrecipIntensityMaxTime", "setPrecipIntensityMaxTime", "precipProbability", "getPrecipProbability", "setPrecipProbability", "precipType", "getPrecipType", "setPrecipType", "pressure", "getPressure", "setPressure", "summary", "getSummary", "setSummary", "sunriseTime", "getSunriseTime", "setSunriseTime", "sunsetTime", "getSunsetTime", "setSunsetTime", "temperatureHigh", "getTemperatureHigh", "setTemperatureHigh", "temperatureHighTime", "getTemperatureHighTime", "setTemperatureHighTime", "temperatureLow", "getTemperatureLow", "setTemperatureLow", "temperatureLowTime", "getTemperatureLowTime", "setTemperatureLowTime", "temperatureMax", "getTemperatureMax", "setTemperatureMax", "temperatureMaxTime", "getTemperatureMaxTime", "setTemperatureMaxTime", "temperatureMin", "getTemperatureMin", "setTemperatureMin", "temperatureMinTime", "getTemperatureMinTime", "setTemperatureMinTime", "time", "", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "uvIndex", "getUvIndex", "setUvIndex", "uvIndexTime", "getUvIndexTime", "setUvIndexTime", "visibility", "getVisibility", "setVisibility", "windBearing", "getWindBearing", "setWindBearing", "windGust", "getWindGust", "setWindGust", "windGustTime", "getWindGustTime", "setWindGustTime", "windSpeed", "getWindSpeed", "setWindSpeed", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class DailyData implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "time")
    private java.lang.Long time;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "summary")
    private java.lang.String summary;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "icon")
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "sunriseTime")
    private java.lang.Integer sunriseTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "sunsetTime")
    private java.lang.Integer sunsetTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "moonPhase")
    private java.lang.Double moonPhase;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "precipIntensity")
    private java.lang.Double precipIntensity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "precipIntensityMax")
    private java.lang.Double precipIntensityMax;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "precipIntensityMaxTime")
    private java.lang.Double precipIntensityMaxTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "precipProbability")
    private java.lang.Double precipProbability;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "precipType")
    private java.lang.String precipType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureHigh")
    private java.lang.Double temperatureHigh;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureHighTime")
    private java.lang.Double temperatureHighTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureLow")
    private java.lang.Double temperatureLow;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureLowTime")
    private java.lang.Double temperatureLowTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureHigh")
    private java.lang.Double apparentTemperatureHigh;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureHighTime")
    private java.lang.Double apparentTemperatureHighTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureLow")
    private java.lang.Double apparentTemperatureLow;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureLowTime")
    private java.lang.Double apparentTemperatureLowTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "dewPoint")
    private java.lang.Double dewPoint;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private java.lang.Double humidity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private java.lang.Double pressure;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "windSpeed")
    private java.lang.Double windSpeed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "windGust")
    private java.lang.Double windGust;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "windGustTime")
    private java.lang.Integer windGustTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "windBearing")
    private java.lang.Integer windBearing;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "cloudCover")
    private java.lang.Double cloudCover;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "uvIndex")
    private java.lang.Integer uvIndex;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "uvIndexTime")
    private java.lang.Integer uvIndexTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private java.lang.Double visibility;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "ozone")
    private java.lang.Double ozone;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureMin")
    private java.lang.Double temperatureMin;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureMinTime")
    private java.lang.Double temperatureMinTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureMax")
    private java.lang.Double temperatureMax;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "temperatureMaxTime")
    private java.lang.Double temperatureMaxTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureMin")
    private java.lang.Double apparentTemperatureMin;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureMinTime")
    private java.lang.Integer apparentTemperatureMinTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureMax")
    private java.lang.Double apparentTemperatureMax;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "apparentTemperatureMaxTime")
    private java.lang.Double apparentTemperatureMaxTime;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Parcelable.Creator<com.au.rightway.weatherforecast.networking.responsemodels.DailyData> CREATOR = null;
    public static final com.au.rightway.weatherforecast.networking.responsemodels.DailyData.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSunriseTime() {
        return null;
    }
    
    public final void setSunriseTime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSunsetTime() {
        return null;
    }
    
    public final void setSunsetTime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMoonPhase() {
        return null;
    }
    
    public final void setMoonPhase(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecipIntensity() {
        return null;
    }
    
    public final void setPrecipIntensity(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecipIntensityMax() {
        return null;
    }
    
    public final void setPrecipIntensityMax(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecipIntensityMaxTime() {
        return null;
    }
    
    public final void setPrecipIntensityMaxTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrecipProbability() {
        return null;
    }
    
    public final void setPrecipProbability(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrecipType() {
        return null;
    }
    
    public final void setPrecipType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureHigh() {
        return null;
    }
    
    public final void setTemperatureHigh(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureHighTime() {
        return null;
    }
    
    public final void setTemperatureHighTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureLow() {
        return null;
    }
    
    public final void setTemperatureLow(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureLowTime() {
        return null;
    }
    
    public final void setTemperatureLowTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureHigh() {
        return null;
    }
    
    public final void setApparentTemperatureHigh(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureHighTime() {
        return null;
    }
    
    public final void setApparentTemperatureHighTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureLow() {
        return null;
    }
    
    public final void setApparentTemperatureLow(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureLowTime() {
        return null;
    }
    
    public final void setApparentTemperatureLowTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDewPoint() {
        return null;
    }
    
    public final void setDewPoint(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getHumidity() {
        return null;
    }
    
    public final void setHumidity(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPressure() {
        return null;
    }
    
    public final void setPressure(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWindSpeed() {
        return null;
    }
    
    public final void setWindSpeed(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWindGust() {
        return null;
    }
    
    public final void setWindGust(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWindGustTime() {
        return null;
    }
    
    public final void setWindGustTime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWindBearing() {
        return null;
    }
    
    public final void setWindBearing(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCloudCover() {
        return null;
    }
    
    public final void setCloudCover(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUvIndex() {
        return null;
    }
    
    public final void setUvIndex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUvIndexTime() {
        return null;
    }
    
    public final void setUvIndexTime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVisibility() {
        return null;
    }
    
    public final void setVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOzone() {
        return null;
    }
    
    public final void setOzone(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureMin() {
        return null;
    }
    
    public final void setTemperatureMin(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureMinTime() {
        return null;
    }
    
    public final void setTemperatureMinTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureMax() {
        return null;
    }
    
    public final void setTemperatureMax(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperatureMaxTime() {
        return null;
    }
    
    public final void setTemperatureMaxTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureMin() {
        return null;
    }
    
    public final void setApparentTemperatureMin(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getApparentTemperatureMinTime() {
        return null;
    }
    
    public final void setApparentTemperatureMinTime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureMax() {
        return null;
    }
    
    public final void setApparentTemperatureMax(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getApparentTemperatureMaxTime() {
        return null;
    }
    
    public final void setApparentTemperatureMaxTime(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    protected DailyData(@org.jetbrains.annotations.NotNull()
    android.os.Parcel in) {
        super();
    }
    
    public DailyData() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Parcelable.Creator<com.au.rightway.weatherforecast.networking.responsemodels.DailyData> getCREATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}