package com.example.estadostexttextfieldbotones.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MyTextField(modifier: Modifier = Modifier) {
    var text by rememberSaveable { mutableStateOf("") }
    Column(modifier = modifier) {
        TextField("Contenido", onValueChange = {})
        TextField(text, onValueChange = { text = it })
    }
}


@Composable
fun MyTextFieldParent(modifier: Modifier = Modifier) {
    var user by rememberSaveable { mutableStateOf("") }
    var dato by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Usuario", modifier = Modifier.padding(end = 5.dp))
            MyTextFieldUser(user) {
                user = it
            }
        }
        MyTextFieldDato(dato) { dato = it }
    }

}


@Composable
fun MyTextFieldUser(user: String, onUserChange: (String) -> Unit) {

    TextField(user, onValueChange = { onUserChange(it) })

}


@Composable
fun MyTextFieldDato(dato: String, onValueChange: (String) -> Unit) {

    TextField(
        dato, onValueChange = { onValueChange(it) },
        placeholder = { MyBoxWithText() },
        label = { Text("Introdice dato") }  // suele ir sin placeholder
    )

}


@Composable
fun MyBoxWithText() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Hola desde el Box")
    }
}












