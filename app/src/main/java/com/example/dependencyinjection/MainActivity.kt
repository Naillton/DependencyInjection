package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

/**
 * Podemos fazer injeção de dependencia em kotlin de 3 maneiras, pelo construtor, usando metodos e
 * usando campos, tambem podemos inserir dependencias com um framework chamado dagger onde usamos
 * anotações que nos ajudam a evitar reescrita de codigos boilerplate evitando erros.
 *
 * O uso reconmendado de injecao de dependencia é a injecao pelo construtor, os outros dois tipos
 * não são reconmendados
 */

class MainActivity : AppCompatActivity() {
    // usando injecao de dependencias em varias classes
    @Inject
    lateinit var mobile: Mobile
    // usando injecao de dependencia em apenas uma classe
    // private lateinit var mobile: Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MobileApplication).mobile
            .inject(this)

    }
}