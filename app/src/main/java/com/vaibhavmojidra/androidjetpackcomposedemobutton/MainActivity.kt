package com.vaibhavmojidra.androidjetpackcomposedemobutton

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vaibhavmojidra.androidjetpackcomposedemobutton.ui.theme.AndroidJetpackComposeDemoButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeDemoButtonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        ButtonDemo()
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonDemo(){
    val context= LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
    }) {
        Text("Add To Cart")
    }

    Button(
        onClick = {
            Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
        },
        enabled = false
    ) {
        Text("Add To Cart")
    }

    TextButton(onClick = {
        Toast.makeText(context, "Clicked on Text Button", Toast.LENGTH_SHORT).show()
    }) {
        Text("Add To Cart")
    }

    OutlinedButton(onClick = {
        Toast.makeText(context, "Clicked on Out Lined Button", Toast.LENGTH_SHORT).show()
    }) {
        Text("Add To Cart")
    }

    IconButton(onClick = {
        Toast.makeText(
            context,
            "Clicked on Icon Button",
            Toast.LENGTH_SHORT
        ).show()
    }) {
        Icon(
            Icons.Filled.Refresh,
            contentDescription = "Refresh Button",
            tint = Color.DarkGray,
            modifier = Modifier.size(80.dp)
        )
    }
}