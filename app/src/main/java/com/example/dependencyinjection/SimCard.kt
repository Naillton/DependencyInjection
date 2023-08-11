package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val simService: ServiceSim) {
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
        Log.i("TAGY","Sim connected to internet and Calls")
    }
}