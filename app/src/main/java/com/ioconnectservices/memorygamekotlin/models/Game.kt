package com.ioconnectservices.memorygamekotlin.models

import android.arch.lifecycle.MutableLiveData
import com.ioconnectservices.memorygamekotlin.utils.StringUtils.Companion.numbersFromString

class Game(rows : Int, cols : Int) {

    private var totalCards : Int = rows * cols

    val gameEnded = MutableLiveData<Boolean>()

    var cards = Array(rows) { Array(cols) { Card(-1) } }

    fun getTotalCards() : Int {
        return totalCards
    }

    fun hasGameEnded() : Boolean {
        if (areAllPairsFound()) {
            gameEnded.value = true
            return true
        }
        return false
    }

    fun doCardsMatch(key1 : String, key2 : String) : Boolean {
        return cards[numbersFromString(key1)[0]][numbersFromString(key1)[1]].value ==
                cards[numbersFromString(key2)[0]][numbersFromString(key2)[1]].value
    }

    fun areAllPairsFound() : Boolean {
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