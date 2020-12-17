package com.ioconnectservices.memorygamekotlin.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ioconnectservices.memorygamekotlin.R

class Game4x5Fragment : Fragment() {
    private val gameViewModel: GameViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game_3, container, false)
        gameViewModel.init(4, 5)
        setGameEndedListener()
        return view
    }

    private fun setGameEndedListener() {
        gameViewModel.hasGameEnded().observe(viewLifecycleOwner, {
            if (it) onGameEnded()
        })
    }

    private fun onGameEnded() {
        Toast.makeText(
            requireContext(),
            resources.getString(R.string.game_ended_text),
            Toast.LENGTH_SHORT
        ).show()
    }
}
