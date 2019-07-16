package com.ioconnectservices.memorygamekotlin.models

class Card(var value : Int) {

    private var isFound : Boolean = false

    val isNotFound : Boolean
        get() = !isFound

    val isEmpty : Boolean
        get() = value == -1

    init {
        isFound = false
    }

    fun setFound(found : Boolean) {
        this.isFound = found
    }

}