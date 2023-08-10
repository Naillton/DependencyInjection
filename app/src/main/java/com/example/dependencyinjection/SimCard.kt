package com.example.dependencyinjection

import android.util.Log

class SimCard(private val simService: ServiceSim) {
    // injeção de de dependencia de cmapos
    // lateinit var sim: ServiceSim

    /* injeção de dependencia com metodos
    private lateinit var simService: ServiceSim

    fun simServiceCard(simService: ServiceSim) {
        this.simService = simService
    }*/

    init {
        Log.i("TAGY", "Connected Sim Card")
    }

    fun connection() {
        println("Sim connected to internet and Calls")
    }
}