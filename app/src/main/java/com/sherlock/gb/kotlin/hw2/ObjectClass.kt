package com.sherlock.gb.kotlin.hw2

object ObjectClass {
    private val weatherList : List<Weather> = listOf(Weather("London",12),Weather("NewYork",14))
    fun getWeatherList(): List<Weather> {
        return weatherList
    }
}