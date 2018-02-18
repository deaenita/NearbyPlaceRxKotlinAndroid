package com.deaenita.nearbyplacerxkotlinandroid

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by USER on 18/02/2018.
 */
object Network {
    var retrofit = Retrofit.Builder()
            .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
}