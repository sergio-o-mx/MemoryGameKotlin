package com.ioconnectservices.memorygamekotlin.utils

class StringUtils {

    companion object {
        fun stringFromNumbers(numbers : IntArray) : String {
            return numbers[0].toString() + numbers[1].toString()
        }

        fun numbersFromString(key : String) : IntArray {
            val numbers = IntArray(2)
            numbers[0] = key.substring(0, 1).toInt()
            numbers[1] = key.substring(1, 2).toInt()
            return numbers
        }
    }
}