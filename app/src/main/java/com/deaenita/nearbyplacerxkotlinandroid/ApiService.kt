package com.deaenita.nearbyplacerxkotlinandroid

import com.deaenita.nearbyplacerxkotlinandroid.model.ResponseServer
import com.deaenita.nearbyplacerxkotlinandroid.model.ResultsItem
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by USER on 18/02/2018.
 */
interface ApiService {

    @GET("json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=cruise&key=AIzaSyBJL9iM3NBcVaQ2b06X8V44FDey4Pr3bAA")
    fun getPlace():Observable<ResponseServer>

}