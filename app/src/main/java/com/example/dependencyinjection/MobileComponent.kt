package com.example.dependencyinjection

import dagger.Component

/**
 * Criando interface com uma funcao de acessar a instancia da classe Mobile
 */
@Component(modules = [
    ServiceSimModule::class,
    BatteryModule::class,
    DisplayModule::class,
])
interface MobileComponent {
    // quando temos apenas uma classe no nosso projeto é dessa forma que instanciamos com o dagger
    // fun getMobileInstance(): Mobile

    // se tivessemos 5 classes diferentes em nosso projeto cada uma com sua dependencia de injecao
    // poderiamos definir uma funcao de instancia diferente onde passariamos a activity principal
    // como parametro injetando dependencias da activity principal ate as demais.
    fun inject(activity: MainActivity)
}