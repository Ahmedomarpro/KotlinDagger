package com.ao.dagger2_mvvm.ui.main

import android.util.Log
 import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.foxhole.kotlinrestapijsonplaceholder.model.User
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel  @Inject constructor (private val mainRepository: MainRepository) : ViewModel(), MainViewModelInterface{

    private val _tag : String = MainViewModel::class.java.name

    private val _userMutableLiveData = MediatorLiveData<Resource<List<User>>>()
    private val _compositeDisposable = CompositeDisposable()

    init {
        loadUserList()
    }


    override fun getUserList(): LiveData<Resource<List<User>>> {
        Log.d(_tag ,"MainViewModel Called from getUserList")
        return _userMutableLiveData
    }

    override fun loadUserList() {
        Log.d(_tag ,"MainViewModel Called from loadUserList")
        var disposable  = mainRepository.getAllUser()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
                _userMutableLiveData.value = Resource.loading()
            }
            .subscribe({
                _userMutableLiveData.value = Resource.success(it)
            },{
                _userMutableLiveData.value = Resource.error(it.localizedMessage, null)
            })

        _compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        _compositeDisposable.clear()
    }

}