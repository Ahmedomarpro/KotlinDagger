package com.foxhole.kotlinrestapijsonplaceholder.di.main

import com.foxhole.kotlinrestapijsonplaceholder.model.User
import io.reactivex.Flowable
import retrofit2.http.GET

interface MainApi{

    @GET("posts/")
    fun getAllUsers(): Flowable<List<User>>
}