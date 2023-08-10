package com.example.dependencyinjection

import android.util.Log

class Battery {

    init {
        Log.i("TAGY", "Created Battery")
    }

    fun lifeCicleBattery() {
        println("Battery 100%")
    }
}