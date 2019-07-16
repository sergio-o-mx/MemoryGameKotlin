package com.ioconnectservices.memorygamekotlin.utils

import com.ioconnectservices.memorygamekotlin.R

class CardsUtils {

    companion object {

        private val mCardResources = intArrayOf(
            R.mipmap.spade_01,
            R.mipmap.spade_02,
            R.mipmap.spade_03,
            R.mipmap.spade_04,
            R.mipmap.spade_05,
            R.mipmap.spade_06,
            R.mipmap.spade_07,
            R.mipmap.spade_08,
            R.mipmap.spade_09,
            R.mipmap.spade_10
        )

        fun getCardResource(cardValue: Int): Int {
            return mCardResources[cardValue]
        }

        fun getCardValue(totalCardsSetCounter: Int, midIndicator: Int): Int {
            return if (totalCardsSetCounter > midIndicator)
                totalCardsSetCounter - (midIndicator + 1)
            else
                totalCardsSetCounter
        }
    }
}