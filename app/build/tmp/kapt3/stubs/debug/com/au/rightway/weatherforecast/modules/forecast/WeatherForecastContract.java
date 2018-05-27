package com.au.rightway.weatherforecast.modules.forecast;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract;", "", "BaseViewHolder", "ForecastDataViewHolder", "ForecastHeaderViewHolder", "Presenter", "TodaysSummaryViewHolder", "View", "app_debug"})
public abstract interface WeatherForecastContract {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$View;", "", "hideLoading", "", "setCouldNotLoadLayoutVisibility", "showCouldNotLoadLayout", "", "showLoading", "updateView", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateView();
        
        public abstract void showLoading();
        
        public abstract void hideLoading();
        
        public abstract void setCouldNotLoadLayoutVisibility(boolean showCouldNotLoadLayout);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$Presenter;", "", "itemCount", "", "getItemCount", "()I", "attachView", "", "view", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$View;", "clearDisposables", "detachView", "getItemViewType", "position", "getWeatherDetails", "onBindViewHolderAtPosition", "holder", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$BaseViewHolder;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract int getItemCount();
        
        public abstract void onBindViewHolderAtPosition(@org.jetbrains.annotations.NotNull()
        com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.BaseViewHolder holder, int position);
        
        public abstract void getWeatherDetails();
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull()
        com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.View view);
        
        public abstract void detachView();
        
        public abstract void clearDisposables();
        
        public abstract int getItemViewType(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$BaseViewHolder;", "", "app_debug"})
    public static abstract interface BaseViewHolder {
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$TodaysSummaryViewHolder;", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$BaseViewHolder;", "setHumidity", "", "humidity", "", "setPressure", "pressure", "setTemperature", "temperature", "setTodaysSummary", "todaysSummary", "setWindSpeed", "windSpeed", "app_debug"})
    public static abstract interface TodaysSummaryViewHolder extends com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.BaseViewHolder {
        
        public abstract void setTodaysSummary(@org.jetbrains.annotations.NotNull()
        java.lang.String todaysSummary);
        
        public abstract void setTemperature(@org.jetbrains.annotations.NotNull()
        java.lang.String temperature);
        
        public abstract void setWindSpeed(@org.jetbrains.annotations.NotNull()
        java.lang.String windSpeed);
        
        public abstract void setHumidity(@org.jetbrains.annotations.NotNull()
        java.lang.String humidity);
        
        public abstract void setPressure(@org.jetbrains.annotations.NotNull()
        java.lang.String pressure);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$ForecastDataViewHolder;", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$BaseViewHolder;", "setHumidity", "", "humidity", "", "setPressure", "pressure", "setTemperature", "temperature", "setWindSpeed", "windSpeed", "app_debug"})
    public static abstract interface ForecastDataViewHolder extends com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.BaseViewHolder {
        
        public abstract void setTemperature(@org.jetbrains.annotations.NotNull()
        java.lang.String temperature);
        
        public abstract void setWindSpeed(@org.jetbrains.annotations.NotNull()
        java.lang.String windSpeed);
        
        public abstract void setHumidity(@org.jetbrains.annotations.NotNull()
        java.lang.String humidity);
        
        public abstract void setPressure(@org.jetbrains.annotations.NotNull()
        java.lang.String pressure);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$ForecastHeaderViewHolder;", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastContract$BaseViewHolder;", "setForecastDate", "", "forecastDate", "", "app_debug"})
    public static abstract interface ForecastHeaderViewHolder extends com.au.rightway.weatherforecast.modules.forecast.WeatherForecastContract.BaseViewHolder {
        
        public abstract void setForecastDate(@org.jetbrains.annotations.NotNull()
        java.lang.String forecastDate);
    }
}