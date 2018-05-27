package com.au.rightway.weatherforecast.networking;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/au/rightway/weatherforecast/networking/WeatherForecastApi;", "", "accountDetails", "Lio/reactivex/Single;", "Lcom/au/rightway/weatherforecast/networking/responsemodels/WeatherData;", "getAccountDetails", "()Lio/reactivex/Single;", "app_debug"})
public abstract interface WeatherForecastApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "-33.8650,151.2094")
    public abstract io.reactivex.Single<com.au.rightway.weatherforecast.networking.responsemodels.WeatherData> getAccountDetails();
}