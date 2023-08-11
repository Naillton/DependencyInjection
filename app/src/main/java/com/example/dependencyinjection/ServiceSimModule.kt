package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
@Module
class ServiceSimModule {
    @Provides
    fun providesServiceSim(): ServiceSim {
        return ServiceSim()
    }
}