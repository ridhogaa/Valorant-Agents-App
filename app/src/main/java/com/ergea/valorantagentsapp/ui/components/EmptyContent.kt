package com.ergea.valorantagentsapp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ergea.valorantagentsapp.ui.theme.ValorantAgentsAppTheme
import com.ergea.valorantagentsapp.R

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun EmptyContent(
    modifier: Modifier = Modifier,
    text: String,
    @DrawableRes image: Int
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(248.dp),
            painter = painterResource(image),
            contentDescription = stringResource(id = R.string.empty_state)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            modifier = modifier.fillMaxWidth(),
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Black,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun EmptyDataPreview() {
    ValorantAgentsAppTheme {
        EmptyContent(
            text = stringResource(id = R.string.no_result_found),
            image = R.drawable.not_found_search
        )
    }
}