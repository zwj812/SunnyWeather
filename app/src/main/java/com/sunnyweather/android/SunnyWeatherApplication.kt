package com.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * @author wenji.zhao
 * @time 2022/12/29 3:40 下午
 * @email wj.zhao08@zuche.com
 * @desc
 */
class SunnyWeatherApplication : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "Wmut3F3AaVunbDU7"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}