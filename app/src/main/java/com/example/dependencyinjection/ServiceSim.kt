package com.example.dependencyinjection

import android.util.Log

class ServiceSim {

    init {
        Log.i("TAGY", "Initialize Sim Card")
    }

    fun serviceStart() {
        Log.i("TAGY","Service is connected")
    }
}