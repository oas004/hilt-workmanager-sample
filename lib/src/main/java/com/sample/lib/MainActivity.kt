package com.sample.lib

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen()
        }
    }
}

@Composable
private fun MainScreen(mainViewModel: MainViewModel = viewModel()) {
    Scaffold {
        Surface(modifier = Modifier.fillMaxWidth()) {
            TextButton(
                modifier = Modifier.size(100.dp),
                onClick = mainViewModel::startWorkManagerTask,
            ) {
                Text("Tap to start workmanager task")
            }
        }
    }
}
