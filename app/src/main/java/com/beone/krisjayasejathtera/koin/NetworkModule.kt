package com.beone.krisjayasejathtera.koin

import com.beone.krisjayasejathtera.BuildConfig
import com.beone.krisjayasejathtera.data.remote.ApiDataService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val NetworkModule = module {

    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor =  HttpLoggingInterceptor(logger = HttpLoggingInterceptor.Logger.DEFAULT)
        if(BuildConfig.DEBUG) {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }else{
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
        }

        return httpLoggingInterceptor
    }

    fun provideHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor) = OkHttpClient.Builder()
        .connectTimeout(6, TimeUnit.SECONDS)
        .readTimeout(6, TimeUnit.SECONDS)
        .writeTimeout(6, TimeUnit.SECONDS)
        .retryOnConnectionFailure(false)
        .addInterceptor(httpLoggingInterceptor)
        .build()

    fun provideGson() = GsonConverterFactory.create()

    fun provideRxJavaCallAdapter() = RxJava2CallAdapterFactory.create()

    fun provideRetrofit(
        callAdapter: RxJava2CallAdapterFactory,
        converterAdapter: GsonConverterFactory,
        client: OkHttpClient
    ) =
        Retrofit.Builder()
            .client(client)
            .baseUrl(Constants.BASE_URL)
            .addCallAdapterFactory(callAdapter)
            .addConverterFactory(converterAdapter)
            .build()

    fun provideApiDataService(retrofit: Retrofit) = retrofit.create(ApiDataService::class.java)

    single{
        provideHttpLoggingInterceptor()
    }

    single {
        provideGson()
    }
    single {
        provideHttpClient(get())
    }
    single {
        provideRxJavaCallAdapter()
    }
    single {
        provideRetrofit(get(), get(), get())
    }
    single<ApiDataService> {
        provideApiDataService(get())
    }

}

