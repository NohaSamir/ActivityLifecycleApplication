package com.example.activitylifecycleapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.activitylifecycleapplication.ui.theme.ActivityLifecycleApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger("Main Activity: onCreate")

        setContent {
            ActivityLifecycleApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Main Activity")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        logger("Main Activity: onStart")
    }

    override fun onResume() {
        super.onResume()
        logger("Main Activity: onResume")
    }

    override fun onPause() {
        super.onPause()
        logger("Main Activity: onPause")
    }

    override fun onStop() {
        super.onStop()
        logger("Main Activity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger("Main Activity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        logger("Main Activity: onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        logger("Main Activity: onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        logger("Main Activity: onRestoreInstanceState")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )

        Button(onClick = {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Navigate to next screen")
        }

        Button(onClick = {
            showDialog = true
        }) {
            Text("Show Dialog")
        }
    }

    if (showDialog) {
        ShowDialog(
            onDismissed = {
                showDialog = false
            }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivityLifecycleApplicationTheme {
        Greeting("Android")
    }
}

@Composable
fun ShowDialog(onDismissed: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismissed,
        title = {
            Text(text = "Dialog Title")
        },
        text = {
            Text("This is a dialog message")
        },
        confirmButton = {
            Button(
                onClick = {
                    // Dismiss the dialog
                    onDismissed()
                }
            ) {
                Text("OK")
            }
        }
    )
}

fun logger(message: String) {
    Log.d("Lifecycle ", message)
}
