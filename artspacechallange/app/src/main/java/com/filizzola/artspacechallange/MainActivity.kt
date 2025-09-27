package com.filizzola.artspacechallange

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.filizzola.artspacechallange.ui.theme.ArtSpaceChallangeTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceChallangeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    papaizinArtLayout()

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceChallangeTheme {
        Greeting()
    }
}

@Composable
fun papaizinArtLayout(modifier: Modifier = Modifier) {
    var cont by remember { mutableIntStateOf(1) }
    val img = when (cont) {
        1 -> R.drawable.lotus
        else -> R.drawable.lexus
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            modifier = Modifier
                .shadow(15.dp)
                .padding(40.dp)
                .fillMaxWidth()
                .fillMaxHeight(0.7f),
            painter = painterResource(img),
            contentDescription = when (cont) {
                1 -> "Lotus image"
                else -> "Lexus LFA image"
            }
        )

        Column() {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(1f)
                    .background(color = Color.LightGray),
            ) {
                Text(
                    text = when (cont) {
                        1 -> "Lotus elise"
                        else -> "Lexus LFA"
                    },
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp, end = 10.dp)
                )
                Text(
                    text = when (cont) {
                        1 -> "Fraquinho"
                        else -> "Potente"
                    },
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { cont-- },
                    modifier = Modifier
                        .width(150.dp)
                ) {
                    Text(
                        text = "Previous"
                    )
                }
                if (cont < 1) {
                    cont = 2
                }
                Button(
                    onClick = { cont++ },
                    modifier = Modifier
                        .width(150.dp)
                ) {
                    Text(
                        text = "Next"
                    )
                }
                if (cont > 2) {
                    cont = 1
                }
            }
        }
    }
}