package com.ao.dagger2_mvvm.ui.main

import com.foxhole.kotlinrestapijsonplaceholder.di.main.MainApi
import com.foxhole.kotlinrestapijsonplaceholder.model.User
import io.reactivex.Flowable

class MainRepository (private val mainApi: MainApi) : MainRepoInterface{

    override fun getAllUser(): Flowable<List<User>> {
        return mainApi.getAllUsers()
    }

}