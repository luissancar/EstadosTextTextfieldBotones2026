package com.example.estadostexttextfieldbotones.Components

import android.R.attr.fontStyle
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
// Ctrl + Click para ver el codigo
fun MyTexts(text: String="Texto", modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("\n")
        Text(text,color=Color.Yellow)
        Text(text, fontSize = 30.sp)
        Text(text, fontStyle =FontStyle.Italic)
        Text(text, fontWeight = FontWeight.Bold)
    }
}
