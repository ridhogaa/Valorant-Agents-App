package com.ergea.valorantagentsapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ergea.valorantagentsapp.R
import com.ergea.valorantagentsapp.ui.theme.ValorantAgentsAppTheme

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun AgentsItem(
    id: Long,
    image: Int,
    name: String,
    role: String,
    onItemClick: (id: Long) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .width(100.dp)
            .clip(RoundedCornerShape(14.dp))
            .clickable(onClick = {
                onItemClick(id)
            })
            .border(width = 1.dp, color = Color.Black, RoundedCornerShape(14.dp)),
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.onSurface
    ) {
        Column {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(14.dp)
                    )
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(modifier = modifier.height(6.dp))
            Text(
                text = name,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.surface,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = role,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.caption,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(modifier = modifier.height(6.dp))
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AgentsItemPreview() {
    ValorantAgentsAppTheme {
        Row {
            AgentsItem(
                id = 1,
                image = R.drawable.fade,
                name = "Fade",
                role = "Initiator",
                onItemClick = {}
            )
        }
    }
}