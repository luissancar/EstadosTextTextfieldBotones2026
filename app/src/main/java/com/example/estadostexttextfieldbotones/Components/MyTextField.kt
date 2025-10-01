package com.example.estadostexttextfieldbotones.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lint.kotlin.metadata.Visibility



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
    var password by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Usuario", modifier = Modifier.padding(end = 5.dp))
            MyTextFieldUser(user) {
                user = it
            }
        }
        MyTextFieldDato(dato) { dato = it }
        MyTextFieldAd(dato) { dato = it }
        MyPasswordTextField(password) { password = it }
    }

}

@Composable
fun MyPasswordTextField(password: String, onValueChange: (String) -> Unit) {
    var visible by rememberSaveable { mutableStateOf(false) }
    OutlinedTextField(
        password, onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("Contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (visible) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        trailingIcon = {

            val image = if (visible) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }

            val description = if (visible) "Ocultar contraseña" else "Mostrar contraseña"

            IconButton(onClick = { visible = !visible }) {
                Icon(imageVector = image, contentDescription = description)
            }

        }


    )

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


@Composable
fun MyTextFieldAd(dato: String, onValueChange: (String) -> Unit) {

    TextField(
        dato, onValueChange = {
            if (it.contains("a")) {
                onValueChange(it.replace("a", "B"))
            } else
                if (it.contains("b")) {
                    onValueChange(it.replace("b", "A"))
                } else {
                    onValueChange(it)
                }
        },
        label = { Text("Introdice dato") }  // suele ir sin placeholder
    )

}









