package com.foxhole.kotlinrestapijsonplaceholder.di.main

import androidx.lifecycle.ViewModel
import com.ao.dagger2_mvvm.ui.main.MainViewModel
import com.foxhole.kotlinrestapijsonplaceholder.factory.ViewModelKey
 import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun  bindMainViewModel(viewModel : MainViewModel) : ViewModel
}