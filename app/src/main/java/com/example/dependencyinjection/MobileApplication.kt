package com.example.dependencyinjection

import android.app.Application

/**
 * A classe MobileApplication vai ser uma subclass usada para criar a injecao de dependencia e
 * retirar o codigo da activity principal
 */
class MobileApplication: Application() {

    lateinit var mobile: MobileComponent

    override fun onCreate() {
        mobile = initDagger()
        super.onCreate()
    }

    private fun initDagger(): MobileComponent =
        DaggerMobileComponent.builder().displayModule(DisplayModule(1080))
            .build()

    //usando com o dagger
    // em uma linha podemos instanciar a classe e usar seus metodos
    // OBS: dessa forma usamos em apenas uma classe para definir em varias injetaremos
    // e criaremos variaveis com as clases feitas
    // DaggerMobileComponent.create().getMobileInstance().turnMobile()

    // varias classes, sem paremtros em modulos
    // DaggerMobileComponent.create().inject(this)
    // mobile.turnMobile()

    // varias classes com paremtros em modulos, usaremos o builder para fazer uma build
    // diferente no dagger passando valores para nossos modulos

    /* DaggerMobileComponent.builder()
        .displayModule(DisplayModule(1080)).build().inject(this)

    mobile.turnMobile()*/

    // usando sem o dagger
    /*val simService = ServiceSim()
    val simCard = SimCard()
    simCard.simServiceCard(simService)

    val mobile = Mobile(
        Display(),
        SimCard(ServiceSim()),
        Battery()
    )
    mobile.turnMobile()*/
}