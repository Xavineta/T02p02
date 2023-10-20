package com.dam.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {

    BusinessCard(
        header = painterResource(R.drawable.android_robot_3d_logo_3d_model_c4d_max_obj_fbx_ma_lwo_3ds_3dm_stl_3520809_o),
        fullName = stringResource(R.string.full_name),
        title = stringResource(R.string.title),
        phoneImage = painterResource(R.drawable.phone_call_auricular_symbol_in_black_icon_icons_com_56483),
        phoneNumber = stringResource(R.string.phone_number),
        social_mediaImage = painterResource(R.drawable._213454_connections_media_network_share_social_structure_115377),
        social_media = stringResource(R.string.social_media),
        emailImage = painterResource(R.drawable.mail_email_message_electronic_online_web_icon_icons_com_59986),
        email = stringResource(R.string.email)
    )
}

@Composable
private fun BusinessCard(
    header: Painter,
    fullName: String,
    title: String,
    phoneImage: Painter,
    phoneNumber: String,
    social_mediaImage: Painter,
    social_media: String,
    emailImage: Painter,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = header,
            contentDescription = null,
            modifier.size(300.dp),
            alignment = Alignment.Center
        )
        Text(text = fullName, fontSize = 40.sp, textAlign = TextAlign.Center)
        Text(text = title, fontSize = 20.sp, textAlign = TextAlign.Justify)

        Spacer(Modifier.size(40.dp))

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = phoneImage,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)

            )
            Text(text = phoneNumber)
        }

        Spacer(Modifier.size(15.dp))
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = social_mediaImage,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)

            )
            Text(text = social_media)
        }

        Spacer(Modifier.size(15.dp))
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = emailImage,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)

            )
            Text(text = email)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}