package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

/**
 * Para que nos possamos usar o dagger temos que passar as anotacoes necessarias nas nossas classes,
 * ao passar uma anotacao em uma classe em seguida temos que usar a palavra chave construtor,
 * informando que o que temos entre parenteses ser o construtor da classe kotlin
 */

class Mobile @Inject constructor(
    private val display: Display,
    private val simCard: SimCard,
    private val battery: Battery) {

    init {
        display.displayMobile()
        simCard.connection()
        battery.lifeCicleBattery()
    }

    fun turnMobile() {
        Log.i("TAGY", "Device turned on")
    }
}