package com.example.dependencyinjection

class Mobile(
    private val display: Display,
    private val simCard: SimCard,
    private val battery: Battery) {

    init {
        display.displayMobile()
        simCard.connection()
        battery.lifeCicleBattery()
    }

    fun turnMobile() {
        println("Device turned on")
    }
}