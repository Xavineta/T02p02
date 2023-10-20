package com.dam.t01p02b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.t01p02b.ui.theme.T01p02bTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            T01p02bTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManagerApp()
                }
            }
        }
    }
}

@Composable
fun TaskManagerApp() {
    TaskManager(
        title= stringResource(R.string.title_task_manager),
        secondline = stringResource(R.string.second_line_task_manager),
        imagePainter = painterResource(R.drawable.ic_task_completed)
    )
}


@Composable
private fun TaskManager(
    title: String,
    secondline: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = imagePainter, contentDescription = null
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 24.dp, bottom = 15.dp)
        )

        Text(
            text = secondline, fontSize = 16.sp
        )
    }
}

@Preview(showSystemUi = true, showBackground = true, device ="id:pixel_5")
@Composable
fun GreetingPreview() {
    T01p02bTheme {
        TaskManagerApp()
    }
}