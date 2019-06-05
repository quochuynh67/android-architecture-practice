package com.example.footballapp

import android.support.multidex.MultiDexApplication
import com.example.footballapp.di.modules.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        startKoin {
            androidContext(this@MainApp)
            modules(appComponent)
        }
    }

}