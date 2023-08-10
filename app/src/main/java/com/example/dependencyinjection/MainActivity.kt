package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Podemos fazer injeção de dependencia em kotlin de 3 maneiras, pelo construtor, usando metodos e
 * usando campos, tambem podemos inserir dependencias com um framework chamado dagger onde usamos
 * anotações que nos ajudam a evitar reescrita de codigos boilerplate evitando erros.
 *
 * O uso reconmendado de injecao de dependencia é a njecao pelo construtor, os outros dois tipos
 * não são reconmendados
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val simService = ServiceSim()
        val simCard = SimCard()
        simCard.simServiceCard(simService)*/

        val mobile = Mobile(
            Display(),
            SimCard(ServiceSim()),
            Battery()
        )
        mobile.turnMobile()
    }
}