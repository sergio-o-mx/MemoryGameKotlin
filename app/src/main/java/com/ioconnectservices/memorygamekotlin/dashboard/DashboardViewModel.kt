package com.ioconnectservices.memorygamekotlin.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    private var _gameSelected = MutableLiveData<Int>()
    val gameSelected: LiveData<Int>
        get() = _gameSelected

    fun onGameTypeSelected(type : Int) {
        _gameSelected.value = type
    }
}
