package com.filizzola.lemonade

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.filizzola.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    lemonadeApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun lemonadeApp() {
    lemonaderImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun lemonaderImage(modifier: Modifier = Modifier) {
    var stages by remember { mutableIntStateOf(1) }
    val imageResource = when (stages) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }

    val textRes = when (stages) {
        1 -> stringResource(R.string.lemon_tree_desc)
        2 -> stringResource(R.string.lemon_image_desc)
        3 -> stringResource(R.string.lemon_cup_desc)
        else -> stringResource(R.string.empty_glass_desc)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { stages++ }

        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = when (stages) {
                    1 -> stringResource(R.string.lemon_tree)
                    2 -> stringResource(R.string.lemon_image)
                    3 -> stringResource(R.string.lemon_cup)
                    else -> stringResource(R.string.empty_glass)
                },

            )
        }
        if (stages > 4) {
            stages = 1
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text (text = textRes)

    }
}