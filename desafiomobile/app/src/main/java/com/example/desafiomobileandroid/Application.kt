package com.example.desafiomobileandroid

import android.app.Application
import com.example.desafiomobileandroid.di.itemCartModule
import com.example.desafiomobileandroid.di.networkModule
import com.example.desafiomobileandroid.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@Application)
            modules(listOf(
                viewModelModule,
                networkModule,
                itemCartModule
            ))
        }
    }
}