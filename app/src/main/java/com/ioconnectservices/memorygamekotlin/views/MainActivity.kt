package com.ioconnectservices.memorygamekotlin.views

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ioconnectservices.memorygamekotlin.R
import com.ioconnectservices.memorygamekotlin.databinding.ActivityMainBinding
import com.ioconnectservices.memorygamekotlin.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private val mGameType = "type"

    private val mGameType4x3 = 1
    private val mGameType4x4 = 2
    private val mGameType4x5 = 3

    private var mMainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        mMainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        activityMainBinding.mainViewModel = mMainViewModel
        setGameSelectedListener()
    }

    private fun setGameSelectedListener() {
        mMainViewModel.gameSelectedLiveData.observe(this, Observer<Int> { this.onBoardTypeSelected(it!!)})
    }

    fun onBoardTypeSelected(type : Int) {
        val launchGameIntent = Intent(applicationContext, GameActivity::class.java)
        when (type) {
            0 -> launchGameIntent.putExtra(mGameType, mGameType4x3)
            1 -> launchGameIntent.putExtra(mGameType, mGameType4x4)
            2 -> launchGameIntent.putExtra(mGameType, mGameType4x5)
        }
        startActivity(launchGameIntent)
    }
}
