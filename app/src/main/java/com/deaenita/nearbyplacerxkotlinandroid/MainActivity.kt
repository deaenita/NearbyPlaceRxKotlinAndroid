package com.deaenita.nearbyplacerxkotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.deaenita.nearbyplacerxkotlinandroid.model.ResponseServer
import com.deaenita.nearbyplacerxkotlinandroid.model.ResultsItem
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Network.service.getPlace()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe( {t: ResponseServer -> Log.d("data server", t?.results.toString()) }
                        ,{e -> Log.d("eror", e.localizedMessage)} )
    }
}
