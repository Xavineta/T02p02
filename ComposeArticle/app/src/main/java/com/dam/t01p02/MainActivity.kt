package com.dam.t01p02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.t01p02.ui.theme.T01p02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            T01p02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleCardApp()
                }
            }
        }
    }
}


@Composable
fun ArticleCardApp() {
    ArticleCard(
        title=stringResource(R.string.title_jetpack_compose_tutorial),
        shortDescript = stringResource(R.string.compose_short_desc),
        longDescript = stringResource(R.string.compose_long_desc),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}





@Composable
private fun ArticleCard(
    title: String,
    shortDescript: String,
    longDescript: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = imagePainter, contentDescription = null
        )
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDescript,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        )
        Text(
            text = longDescript,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    T01p02Theme {
        ArticleCardApp()
    }
}