package com.au.rightway.weatherforecast.di.components;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/au/rightway/weatherforecast/di/components/ActivityComponents;", "", "inject", "", "fragment", "Lcom/au/rightway/weatherforecast/modules/forecast/WeatherForecastFragment;", "activity", "Lcom/au/rightway/weatherforecast/modules/mainactivity/MainActivity;", "app_debug"})
@dagger.Component(dependencies = {com.au.rightway.weatherforecast.di.components.SupportComponents.class}, modules = {com.au.rightway.weatherforecast.di.modules.ActivityModules.class})
@PerActivity()
public abstract interface ActivityComponents {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.modules.mainactivity.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.modules.forecast.WeatherForecastFragment fragment);
}