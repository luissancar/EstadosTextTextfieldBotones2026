package com.example.estadostexttextfieldbotones.Components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyButton(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        MyButton1()
        MyButton2()
        MyOutLineButton()
        MyTextButton()
        MyElevatedButton()
    }
}


@Composable
fun MyButton1() {

    Button(
        onClick = { Log.d("MyButton", "Pulsado")},
        enabled = true,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,          // Color de fondo cuando está habilitado
            contentColor = Color.White,           // Color del texto o contenido cuando está habilitado
            disabledContainerColor = Color.Gray,  // Color de fondo cuando está deshabilitado
            disabledContentColor = Color.DarkGray // Color del texto cuando está deshabilitado
        ),
        border = BorderStroke(3.dp, Color.Yellow),
        shape = RoundedCornerShape(10), // por ciento,
    ) {
        Column {
            Text("Pulsar")
            Text("Pulsar")
        }
    }
}


@Composable
fun MyButton2() {
    var enable by remember { mutableStateOf(true) }
    Button(
        onClick = {enable=false},
        enabled = enable,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,          // Color de fondo cuando está habilitado
            contentColor = Color.White,           // Color del texto o contenido cuando está habilitado
            disabledContainerColor = Color.Gray,  // Color de fondo cuando está deshabilitado
            disabledContentColor = Color.DarkGray // Color del texto cuando está deshabilitado
        ),
        border = BorderStroke(3.dp,Color.Yellow)
    ) {

        Text("Enabled")
    }
}


@Composable
fun MyOutLineButton() {
    OutlinedButton(onClick = {}) {
        Text("Botón")
    }
}



@Composable
fun MyTextButton() {
    TextButton (onClick = {}) {
        Text("Botón")
    }
}


@Composable
fun MyElevatedButton() {
    ElevatedButton (onClick = {},
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 100.dp,
            focusedElevation = 80.dp,
            hoveredElevation = 8.dp,
            disabledElevation = 0.dp)) {
        Text("Botón Elevated")
    }
}