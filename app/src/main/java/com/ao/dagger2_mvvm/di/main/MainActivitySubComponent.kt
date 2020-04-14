package com.ao.dagger2_mvvm.di.main


import com.ao.dagger2_mvvm.di.ViewModelFactoryModule
import com.ao.dagger2_mvvm.ui.main.MainActivity
import com.foxhole.kotlinrestapijsonplaceholder.di.main.MainModule
import com.foxhole.kotlinrestapijsonplaceholder.di.main.MainViewModelModule
import dagger.Subcomponent


@Subcomponent(modules = [
    MainModule::class,
    ViewModelFactoryModule::class,
    MainViewModelModule::class
])
interface  MainActivitySubComponent{
    fun inject(mainActivity: MainActivity)
}