package com.ergea.valorantagentsapp.ui.screen.about

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ergea.valorantagentsapp.R
import com.ergea.valorantagentsapp.ui.theme.ValorantAgentsAppTheme

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun AboutUsScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_profile),
                contentDescription = stringResource(id = R.string.name_author),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(250.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
            )
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text = stringResource(id = R.string.name_author),
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.surface
            )
            Text(
                text = stringResource(id = R.string.email_author),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.surface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetAgentsAppPreview() {
    ValorantAgentsAppTheme {
        AboutUsScreen()
    }
}