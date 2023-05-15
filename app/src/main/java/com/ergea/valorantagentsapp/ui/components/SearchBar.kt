package com.ergea.valorantagentsapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ergea.valorantagentsapp.ui.theme.ValorantAgentsAppTheme
import com.ergea.valorantagentsapp.R

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    query: String,
    onQueryChange: (String) -> Unit
) {
    TextField(
        value = query,
        onValueChange = onQueryChange,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                tint = Color.LightGray,
                contentDescription = stringResource(id = R.string.search_agent)
            )
        },
        trailingIcon = {
            when {
                query.isNotEmpty() -> IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        tint = Color.LightGray,
                        contentDescription = stringResource(id = R.string.clear_search),
                        modifier = modifier
                            .clickable {
                                onQueryChange("")
                            }
                    )
                }
            }
        },
        singleLine = true,
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.onSurface,
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        placeholder = {
            Text(
                text = stringResource(id = R.string.search_agent),
                color = Color.LightGray
            )
        },
        modifier = modifier
            .padding(14.dp, 8.dp, 14.dp, 8.dp)
            .fillMaxWidth()
            .heightIn(min = 48.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(16.dp)
            )
    )
}

@Composable
@Preview(showBackground = true)
fun SearchBarPreview() {
    ValorantAgentsAppTheme {
        Row {
            SearchBar(
                query = "",
                onQueryChange = {}
            )
        }
    }
}