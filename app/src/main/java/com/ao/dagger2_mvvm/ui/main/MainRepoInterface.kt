package com.ao.dagger2_mvvm.ui.main

import com.foxhole.kotlinrestapijsonplaceholder.model.User
import io.reactivex.Flowable

interface MainRepoInterface {
    fun getAllUser() : Flowable<List<User>>
}