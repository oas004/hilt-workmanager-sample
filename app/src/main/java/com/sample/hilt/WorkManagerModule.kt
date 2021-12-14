package com.sample.hilt

import android.content.Context
import androidx.work.WorkManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class WorkManagerModule {
    @Provides
    fun provideWorkManager(context: Context): WorkManager = WorkManager.getInstance(context)
}