package com.ao.dagger2_mvvm

 import android.app.Application
 import com.ao.dagger2_mvvm.di.AppComponent
 import com.ao.dagger2_mvvm.di.DaggerAppComponent
 import com.ao.dagger2_mvvm.di.modules.NetworkModule

class BaseActivity  : Application() {

    lateinit var appComponent : AppComponent


    override fun onCreate() {
        super.onCreate()
        this.appComponent = this.intDagger()
    }

    private fun intDagger() = DaggerAppComponent.builder()
        .networkModule(NetworkModule())
        .build()
}