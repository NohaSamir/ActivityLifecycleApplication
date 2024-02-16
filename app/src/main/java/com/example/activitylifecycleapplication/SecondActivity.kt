package com.example.activitylifecycleapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.activitylifecycleapplication.ui.theme.ActivityLifecycleApplicationTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger("Second Activity: onCreate")

        setContent {
            ActivityLifecycleApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(
                        text = "Hello Second Activity!"
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        logger("Second Activity: onStart")
    }

    override fun onResume() {
        super.onResume()
        logger("Second Activity: onResume")
    }

    override fun onPause() {
        super.onPause()
        logger("Second Activity: onPause")
    }

    override fun onStop() {
        super.onStop()
        logger("Second Activity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger("Second Activity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        logger("Second Activity: onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        logger("Second Activity: onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        logger("Second Activity: onRestoreInstanceState")
    }
}