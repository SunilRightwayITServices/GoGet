package com.au.rightway.weatherforecast.modules.forecast;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastPresenter;", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$Presenter;", "weatherForecastApi", "Lcom/au/rightway/weatherforecast/networking/WeatherForecastApi;", "schedulersProvider", "Lcom/au/rightway/weatherforecast/utils/SchedulersProvider;", "(Lcom/au/rightway/weatherforecast/networking/WeatherForecastApi;Lcom/au/rightway/weatherforecast/utils/SchedulersProvider;)V", "currentWeatherData", "Lcom/au/rightway/weatherforecast/networking/responsemodels/Currently;", "dailyDataList", "Ljava/util/ArrayList;", "Lcom/au/rightway/weatherforecast/networking/responsemodels/DailyData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isViewAttached", "", "()Z", "itemCount", "", "getItemCount", "()I", "mainView", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$View;", "rowModels", "Lcom/au/rightway/weatherforecast/modules/forecast/RowModel;", "attachView", "", "view", "clearDisposables", "detachView", "getItemViewType", "position", "getWeatherDetails", "onBindViewHolderAtPosition", "holder", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$BaseViewHolder;", "app_debug"})
public final class WeatherForecastPresenter implements com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.Presenter {
    private com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.View mainView;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private com.au.rightway.weatherforecast.networking.responsemodels.Currently currentWeatherData;
    private final java.util.ArrayList<com.au.rightway.weatherforecast.networking.responsemodels.DailyData> dailyDataList = null;
    private final java.util.ArrayList<com.au.rightway.weatherforecast.modules.forecast.RowModel> rowModels = null;
    private final com.au.rightway.weatherforecast.networking.WeatherForecastApi weatherForecastApi = null;
    private final com.au.rightway.weatherforecast.utils.SchedulersProvider schedulersProvider = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolderAtPosition(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.BaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void getWeatherDetails() {
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.View view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void clearDisposables() {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final boolean isViewAttached() {
        return false;
    }
    
    public WeatherForecastPresenter(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.networking.WeatherForecastApi weatherForecastApi, @org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.utils.SchedulersProvider schedulersProvider) {
        super();
    }
}