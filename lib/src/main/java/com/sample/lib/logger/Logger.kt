package com.sample.lib.logger

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LoggerModule {
    @Provides
    fun provideLogger(): Logger = Logger()
}

class Logger {
    fun println(log: String) {
        print(log)
    }
}