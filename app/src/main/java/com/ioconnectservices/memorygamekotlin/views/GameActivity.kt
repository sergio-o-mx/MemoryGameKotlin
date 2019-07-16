package com.ioconnectservices.memorygamekotlin.views

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.ioconnectservices.memorygamekotlin.R
import com.ioconnectservices.memorygamekotlin.databinding.ActivityGame1Binding
import com.ioconnectservices.memorygamekotlin.databinding.ActivityGame2Binding
import com.ioconnectservices.memorygamekotlin.databinding.ActivityGame3Binding
import com.ioconnectservices.memorygamekotlin.viewmodels.GameViewModel

class GameActivity : AppCompatActivity() {

    private val mGameType = "type"

    private var mGameViewModel = GameViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val gameType = intent.getIntExtra(mGameType, 1)
        mGameViewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)
        when (gameType) {
            1 -> {
                val activityGame1Binding = DataBindingUtil.setContentView<ActivityGame1Binding>(this, R.layout.activity_game_1)
                mGameViewModel.init(4, 3)
                activityGame1Binding.gameViewModel = mGameViewModel
            }
            2 -> {
                val activityGame2Binding = DataBindingUtil.setContentView<ActivityGame2Binding>(this, R.layout.activity_game_2)
                mGameViewModel.init(4, 4)
                activityGame2Binding.gameViewModel = mGameViewModel
            }
            3 -> {
                val activityGame3Binding = DataBindingUtil.setContentView<ActivityGame3Binding>(this, R.layout.activity_game_3)
                mGameViewModel.init(4, 5)
                activityGame3Binding.gameViewModel = mGameViewModel
            }
        }
        setGameEndedListener()
    }

    private fun setGameEndedListener() {
        mGameViewModel.hasGameEnded().observe(this, Observer<Boolean> {it})
    }

    fun onGameEnded(value : Boolean) {
        runOnUiThread { Toast.makeText(applicationContext, resources.getString(R.string.game_ended_text),
            Toast.LENGTH_SHORT).show() }
    }
}