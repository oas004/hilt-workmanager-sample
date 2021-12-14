package com.sample.lib

import androidx.lifecycle.ViewModel
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.sample.lib.worker.SampleWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val workManager: WorkManager): ViewModel() {

    fun startWorkManagerTask() {
        val constrainUpload = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .setRequiresBatteryNotLow(true)
            .build()

        val uploadImageWorker = OneTimeWorkRequestBuilder<SampleWorker>()
            .setConstraints(constrainUpload)
            .build()

        workManager.beginWith(uploadImageWorker).enqueue()
    }
}