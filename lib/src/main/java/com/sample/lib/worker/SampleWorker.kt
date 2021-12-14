package com.sample.lib.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.sample.lib.logger.Logger
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class SampleWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val logger: Logger
): CoroutineWorker(appContext, workerParams){
    override suspend fun doWork(): Result {
        logger.println("WORKMANAGER: WORK STARTED")
        return Result.success()
    }
}