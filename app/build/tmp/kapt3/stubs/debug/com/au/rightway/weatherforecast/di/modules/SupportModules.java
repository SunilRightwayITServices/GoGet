package com.au.rightway.weatherforecast.di.modules;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0003H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/au/rightway/weatherforecast/di/modules/SupportModules;", "", "mweatherforecastApplication", "Lcom/au/rightway/weatherforecast/weatherforecastApplication;", "(Lcom/au/rightway/weatherforecast/weatherforecastApplication;)V", "provideGson", "Lcom/google/gson/Gson;", "provideOkHttpCache", "Lokhttp3/Cache;", "application", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "cache", "provideRetrofit", "Lretrofit2/Retrofit;", "gson", "okHttpClient", "provideSchedulerProvider", "Lcom/au/rightway/weatherforecast/utils/SchedulersProvider;", "providesApplication", "provideweatherforecastAPI", "Lcom/au/rightway/weatherforecast/networking/WeatherForecastApi;", "retrofit", "app_debug"})
@dagger.Module()
public final class SupportModules {
    private com.au.rightway.weatherforecast.weatherforecastApplication mweatherforecastApplication;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.au.rightway.weatherforecast.weatherforecastApplication providesApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Cache provideOkHttpCache(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.weatherforecastApplication application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.au.rightway.weatherforecast.networking.WeatherForecastApi provideweatherforecastAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.au.rightway.weatherforecast.utils.SchedulersProvider provideSchedulerProvider() {
        return null;
    }
    
    public SupportModules(@org.jetbrains.annotations.NotNull()
    com.au.rightway.weatherforecast.weatherforecastApplication mweatherforecastApplication) {
        super();
    }
}