package com.filizzola.chellenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.filizzola.chellenge.ui.theme.ChellengeTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChellengeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        title = stringResource(R.string.title),
                        txt1 = stringResource(R.string.text1),
                        txt2 = stringResource(R.string.text2),
                        )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, title: String, txt1: String, txt2: String) {
    val image = painterResource(R.drawable.lexus_lfa_001)

    Box {
        Column {
            Image(
                painter = image,
                contentDescription = "Lexus LFA image",
                contentScale = ContentScale.Crop,

                )

            Row {
                Text(
                    text = title,
                    fontSize = 24.sp,
                    lineHeight = 20.sp,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }

            Row {
                Text(
                    text = txt1,
                    lineHeight = 18.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                )
            }
            Row {
                Text(
                    text = txt2,
                    lineHeight = 18.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChellengeTheme {
        Greeting(
            title = stringResource(R.string.title),
            txt1 = stringResource(R.string.text1),
            txt2 = stringResource(R.string.text2)
        )
    }
}