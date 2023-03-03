package com.example.geek_m5_hw2

import android.app.Application
import com.example.geek_m5_hw2.model.CalculateApi
import com.example.geek_m5_hw2.model.RetrofitService

class App: Application() {


    companion object{
        lateinit var api: CalculateApi
    }
    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().api

    }
}