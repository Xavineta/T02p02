package com.dam.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeCuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeCuadrantApp() {

    Column(modifier = Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            ComposeQuadrant(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.text_composable_text),
                backgroundColor = Color(0xFFEADDFF),
                //Si no le pones esto no aparece visible
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrant(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.image_composable_text),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(Modifier.weight(1f)) {
            ComposeQuadrant(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.row_composable_text),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)

            )
            ComposeQuadrant(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.column_composable_text),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }


    }
}


@Composable
private fun ComposeQuadrant(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold, modifier =
            Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showSystemUi = true, showBackground = true, device = "id:pixel_5")
@Composable
fun ComposeCuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeCuadrantApp()
    }
}