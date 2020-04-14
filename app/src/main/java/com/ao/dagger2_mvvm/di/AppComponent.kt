package com.ao.dagger2_mvvm.di

import com.ao.dagger2_mvvm.di.main.MainActivitySubComponent
import com.ao.dagger2_mvvm.di.modules.NetworkModule
import dagger.Component


@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun newMainActivitySubComponent() : MainActivitySubComponent
}