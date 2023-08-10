package com.example.dependencyinjection

import android.util.Log

class ServiceSim {

    init {
        Log.i("TAGY", "Initialize Sim Card")
    }

    fun serviceStart() {
        println("Service is connected")
    }
}