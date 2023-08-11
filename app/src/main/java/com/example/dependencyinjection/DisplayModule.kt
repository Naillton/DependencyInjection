package com.example.dependencyinjection

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class DisplayModule (private val resolution: Int) {
    @Provides
    fun providerDisplay(): Display {
        return Display()
    }

    init {
        Log.i("TAGY", "The resolution screen is $resolution")
    }
}