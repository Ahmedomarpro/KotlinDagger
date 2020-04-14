package com.ao.dagger2_mvvm.ui.main

import androidx.lifecycle.LiveData
import com.foxhole.kotlinrestapijsonplaceholder.model.User

interface MainViewModelInterface {
    fun getUserList() : LiveData<Resource<List<User>>>
    fun loadUserList()
}