package com.filizzola.challange3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.filizzola.challange3.ui.theme.Challange3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Challange3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Row(modifier = Modifier.weight(1f)) {
            genCard(modifier = Modifier.weight(1f), "um texto para exemplo para o app", "Titulo do texto", Color(0xFF0D2A47), Color.White)
            genCard(modifier = Modifier.weight(1f), "um texto para exemplo para o app", "Titulo do texto", Color(0xFFA8D0E6), Color.Black)
        }
        Row(modifier = Modifier.weight(1f)) {
            genCard(modifier = Modifier.weight(1f), "um texto para exemplo para o app", "Titulo do texto", Color(0xFFF7F7F7), Color.Black)
            genCard(modifier = Modifier.weight(1f), "um texto para exemplo para o app", "Titulo do texto", Color(0xFF595F72), Color.White)
        }
    }
}
@Composable
fun genCard(
    modifier: Modifier = Modifier,
    texto: String,
    titulo: String,
    cor: Color,
    textCor: Color
){
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(cor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = titulo,
            color = textCor,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 16.dp)
        )
        Text(
            text = texto,
            color = textCor,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Challange3Theme {
        Greeting()
    }
}