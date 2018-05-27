package com.au.rightway.weatherforecast.di.modules


import com.au.rightway.weatherforecast.weatherforecastApplication
import com.au.rightway.weatherforecast.networking.WeatherForecastApi
import com.au.rightway.weatherforecast.utils.AndroidSchedulersProvider
import com.au.rightway.weatherforecast.utils.SchedulersProvider
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class SupportModules(private var mweatherforecastApplication: weatherforecastApplication) {

    @Provides
    @Singleton
    fun providesApplication(): weatherforecastApplication {
        return mweatherforecastApplication
    }


    @Provides
    @Singleton
    fun provideOkHttpCache(application: weatherforecastApplication): Cache {
        val cacheSize = 10 * 1024 * 1024 // 10 MiB
        return Cache(application.cacheDir, cacheSize.toLong())
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(cache: Cache): OkHttpClient {
        val httpClientBuilder = OkHttpClient.Builder()
        httpClientBuilder.cache(cache)
        return httpClientBuilder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mweatherforecastApplication.baseURL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    @Provides
    @Singleton
    fun provideweatherforecastAPI(retrofit: Retrofit): WeatherForecastApi {
        return retrofit.create(WeatherForecastApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulersProvider {
        return AndroidSchedulersProvider()
    }
}
