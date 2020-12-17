package com.ioconnectservices.memorygamekotlin.game

import android.databinding.ObservableArrayMap
import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ioconnectservices.memorygamekotlin.R
import com.ioconnectservices.memorygamekotlin.models.Game
import com.ioconnectservices.memorygamekotlin.utils.CardsUtils.Companion.getCardResource
import com.ioconnectservices.memorygamekotlin.utils.CardsUtils.Companion.getCardValue
import com.ioconnectservices.memorygamekotlin.utils.StringUtils.Companion.numbersFromString
import com.ioconnectservices.memorygamekotlin.utils.StringUtils.Companion.stringFromNumbers
import kotlin.random.Random

const val cardBackResource = R.mipmap.card_back

class GameViewModel : ViewModel() {
    private lateinit var game: Game
    private var cols: Int = 0
    private var rows: Int = 0
    private var firstKey: String = ""
    private var secondKey: String = ""

    lateinit var cards: ObservableArrayMap<String, Int>

    fun init(cols: Int, rows: Int) {
        this.cols = cols
        this.rows = rows
        cards = ObservableArrayMap()
        randomizeCards()
    }

    private fun randomizeCards() {
        game = Game(rows, cols)
        val midIndicator = (game.getTotalCards() / 2) - 1
        var totalCardsCounter = 0
        while (totalCardsCounter < game.getTotalCards()) {
            val random1 = Random.nextInt(rows)
            val random2 = Random.nextInt(cols)
            if (game.cards[random1][random2].isEmpty) {
                game.cards[random1][random2].value = getCardValue(totalCardsCounter, midIndicator)
                cards[stringFromNumbers(intArrayOf(random1, random2))] = cardBackResource
                totalCardsCounter++
            }
        }
    }

    fun onClickedCardAt(col: Int, row: Int) {
        if (firstKey.isEmpty() && game.cards[col][row].isNotFound) {
            firstKey = col.toString() + row.toString()
            cards[firstKey] = getCardResource(game.cards[col][row].value)
        } else if (secondKey.isEmpty() && game.cards[col][row].isNotFound) {
            secondKey = col.toString() + row.toString()
            cards[secondKey] = getCardResource(game.cards[col][row].value)
            checkIfCardsMatch()
        }
    }

    private fun checkIfCardsMatch() {
        if (game.doCardsMatch(firstKey, secondKey)) {
            game.cards[numbersFromString(firstKey)[0]][numbersFromString(firstKey)[1]].setFound(true)
            game.cards[numbersFromString(secondKey)[0]][numbersFromString(secondKey)[1]].setFound(
                true
            )
            firstKey = ""
            secondKey = ""
            if (game.hasGameEnded()) {
                Handler().postDelayed({
                    cards.clear()
                    randomizeCards()
                }, 1500)
            }
        } else {
            Handler().postDelayed({
                cards[firstKey] = cardBackResource
                cards[secondKey] = cardBackResource
                firstKey = ""
                secondKey = ""
            }, 1500)
        }
    }

    fun hasGameEnded(): LiveData<Boolean> {
        return game.gameEnded
    }
}
