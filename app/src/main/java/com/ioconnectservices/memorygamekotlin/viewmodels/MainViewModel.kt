package com.ioconnectservices.memorygamekotlin.viewmodels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var gameSelectedLiveData = MutableLiveData<Int>()

    fun onGameTypeSelected(type : Int) {
        gameSelectedLiveData.value = type
    }
}