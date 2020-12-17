package com.ioconnectservices.memorygamekotlin.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ioconnectservices.memorygamekotlin.utils.StringUtils.Companion.numbersFromString

class Game(rows: Int, cols: Int) {
    private var totalCards: Int = rows * cols
    private var _gameEnded = MutableLiveData<Boolean>()
    val gameEnded: LiveData<Boolean>
        get() = _gameEnded
    var cards = Array(rows) { Array(cols) { Card(-1) } }

    fun getTotalCards(): Int {
        return totalCards
    }

    fun doCardsMatch(key1: String, key2: String): Boolean {
        return cards[numbersFromString(key1)[0]][numbersFromString(key1)[1]].value ==
                cards[numbersFromString(key2)[0]][numbersFromString(key2)[1]].value
    }

    fun hasGameEnded(): Boolean {
        if (areAllPairsFound()) {
            _gameEnded.value = true
            return true
        }
        return false
    }

    private fun areAllPairsFound(): Boolean {
        for (cards in cards) {
            for (card in cards) {
                if (card.isNotFound) {
                    return false
                }
            }
        }
        return true
    }
}
