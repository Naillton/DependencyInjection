package com.example.dependencyinjection

import android.util.Log

class Battery {

    init {
        Log.i("TAGY", "Created Battery")
    }

    fun lifeCicleBattery() {
        Log.i("TAGY","Battery 100%")
    }
}