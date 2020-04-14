package com.ao.dagger2_mvvm.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.foxhole.kotlinrestapijsonplaceholder.factory.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract  class ViewModelFactoryModule {

    @Binds
    internal  abstract  fun bindViewModelFactoryModule (factory: ViewModelFactory): ViewModelProvider.Factory
}