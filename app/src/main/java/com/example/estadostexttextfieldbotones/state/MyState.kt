package com.example.estadostexttextfieldbotones.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier = Modifier) {
    // var number: String = "0"

    // var number = remember { mutableStateOf(1) }
    //var number = rememberSaveable { mutableStateOf(1) } // podemos guardar el estado de la app
    var number by rememberSaveable() { mutableStateOf(1) }  //evitamos el .value
    Text(
        //    "Pulsar ${number.value}",
        //  modifier = modifier.clickable {  number.value +=1 }

        "Pulsar ${number}",
        modifier = modifier.clickable { number += 1 }


    )

}

@Composable
fun MyState2(modifier: Modifier = Modifier) {

    var number by rememberSaveable() { mutableStateOf(1) }  //evitamos el .value
    Column(modifier = modifier) {
        MyStateParte01(number, onClick = { number += 1 })
        MyStateParte02(number) { number += 1 } // si es último parámetro se puede poner así
    }
}


@Composable
fun MyStateParte01(number: Int, onClick: () -> Unit = {}) {
    Text(
        "Pulsar ${number}",
        modifier = Modifier.clickable { onClick() })
}


@Composable
fun MyStateParte02(number: Int, onClick: () -> Unit = {}) {
    Text(
        "Pulsar ${number}",
        modifier = Modifier.clickable { onClick() })
}