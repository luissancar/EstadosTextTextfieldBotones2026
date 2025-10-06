package com.example.estadostexttextfieldbotones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.estadostexttextfieldbotones.Components.MyButton
import com.example.estadostexttextfieldbotones.Components.MyTextField
import com.example.estadostexttextfieldbotones.Components.MyTextFieldParent
import com.example.estadostexttextfieldbotones.Components.MyTexts
import com.example.estadostexttextfieldbotones.state.MyState
import com.example.estadostexttextfieldbotones.state.MyState2
import com.example.estadostexttextfieldbotones.ui.theme.EstadosTextTextfieldBotonesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EstadosTextTextfieldBotonesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   // MyState(modifier = Modifier.padding(innerPadding))
                 //   MyState2(modifier = Modifier.padding(innerPadding))
                   // MyTexts("texto",modifier = Modifier.padding(innerPadding))
                  //  MyTextField(modifier = Modifier.padding(innerPadding))
                  //  MyTextFieldParent(modifier = Modifier.padding(innerPadding))
                    MyButton(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EstadosTextTextfieldBotonesTheme {
        Greeting("Android")
    }
}