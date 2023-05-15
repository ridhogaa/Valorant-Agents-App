package com.ergea.valorantagentsapp.ui.screen.detail

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ergea.valorantagentsapp.R
import com.ergea.valorantagentsapp.di.Injection
import com.ergea.valorantagentsapp.model.Agent
import com.ergea.valorantagentsapp.model.FakeAgentDataSource
import com.ergea.valorantagentsapp.ui.common.UiState
import com.ergea.valorantagentsapp.ui.theme.ValorantAgentsAppTheme
import com.ergea.valorantagentsapp.utils.ViewModelFactory

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun DetailScreen(
    id: Long,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(
            Injection.provideRepository()
        )
    ),
    navigateBack: () -> Unit
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getAgentById(id)
            }
            is UiState.Success -> {
                val data = uiState.data
                DetailContent(
                    data,
                    navigateBack,
                    onFavoriteButtonClicked = { id, state ->
                        viewModel.updateAgent(id, state)
                    }
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun DetailContent(
    agent: Agent,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    onFavoriteButtonClicked: (id: Int, state: Boolean) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.detail_screen)) },
                actions = {
                    IconButton(onClick = {
                        onFavoriteButtonClicked(agent.id.toInt(), agent.isFavorite)
                    }) {
                        Icon(
                            imageVector = if (!agent.isFavorite) Icons.Default.FavoriteBorder else Icons.Default.Favorite,
                            contentDescription = if (!agent.isFavorite) stringResource(id = R.string.add_to_fav)
                            else stringResource(id = R.string.remove_from_fav),
                            tint = if (!agent.isFavorite) Color.White else Color.Red
                        )
                    }
                },
                elevation = 0.dp,
                backgroundColor = MaterialTheme.colors.primary,
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(id = R.string.navigate_back),
                        modifier = modifier
                            .size(24.dp, 24.dp)
                            .clickable {
                                onBackClick()
                            }
                    )
                }
            )
        },
        content = {
            Column(modifier = modifier.padding(it)) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .weight(1f)
                ) {
                    Box {
                        Image(
                            painter = painterResource(agent.image),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = modifier
                                .height(300.dp)
                                .fillMaxWidth()
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Row {
                            Text(
                                modifier = modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                                text = agent.name,
                                style = MaterialTheme.typography.h5,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.surface
                            )
                            Spacer(modifier.weight(1f))
                            Text(
                                modifier = modifier
                                    .padding(0.dp, 0.dp, 0.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.role,
                                color = MaterialTheme.colors.surface,
                                style = MaterialTheme.typography.subtitle1
                            )
                        }
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(0.dp, 0.dp, 0.dp, 8.dp)
                                .height(2.dp)
                                .background(Color.LightGray)
                        )
                        Text(
                            text = agent.desc,
                            style = MaterialTheme.typography.body2,
                            textAlign = TextAlign.Justify,
                            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.abilities),
                            style = MaterialTheme.typography.h5,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.surface,
                            modifier = Modifier
                                .align(alignment = Alignment.Start)
                                .padding(0.dp, 0.dp, 0.dp, 8.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(0.dp, 0.dp, 0.dp, 8.dp)
                                .height(2.dp)
                                .background(Color.LightGray)
                        )

                        Row {
                            Text(
                                modifier = modifier
                                    .padding(0.dp, 0.dp, 8.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillQName,
                                style = MaterialTheme.typography.h6,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.surface
                            )
                            Spacer(modifier.weight(1f))
                            Text(
                                modifier = modifier
                                    .padding(14.dp, 0.dp, 0.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillQDesc,
                                color = MaterialTheme.colors.surface,
                                style = MaterialTheme.typography.body2,
                                textAlign = TextAlign.Start,
                            )
                        }

                        Row {
                            Text(
                                modifier = modifier
                                    .padding(0.dp, 0.dp, 8.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillEName,
                                style = MaterialTheme.typography.h6,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.surface
                            )
                            Spacer(modifier.weight(1f))
                            Text(
                                modifier = modifier
                                    .padding(14.dp, 0.dp, 0.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillEDesc,
                                color = MaterialTheme.colors.surface,
                                style = MaterialTheme.typography.body2,
                                textAlign = TextAlign.Start,
                            )
                        }

                        Row {
                            Text(
                                modifier = modifier
                                    .padding(0.dp, 0.dp, 8.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillCName,
                                style = MaterialTheme.typography.h6,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.surface
                            )
                            Spacer(modifier.weight(1f))
                            Text(
                                modifier = modifier
                                    .padding(14.dp, 0.dp, 0.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillCDesc,
                                color = MaterialTheme.colors.surface,
                                style = MaterialTheme.typography.body2,
                                textAlign = TextAlign.Start,
                            )
                        }

                        Row {
                            Text(
                                modifier = modifier
                                    .padding(0.dp, 0.dp, 8.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillXName,
                                style = MaterialTheme.typography.h6,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.surface
                            )
                            Spacer(modifier.weight(1f))
                            Text(
                                modifier = modifier
                                    .padding(14.dp, 0.dp, 0.dp, 8.dp)
                                    .align(Alignment.CenterVertically),
                                text = agent.skillXDesc,
                                color = MaterialTheme.colors.surface,
                                style = MaterialTheme.typography.body2,
                                textAlign = TextAlign.Start,
                            )
                        }
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DetailContentPreview() {
    ValorantAgentsAppTheme {
        DetailContent(
            FakeAgentDataSource.dummyAgents[0],
            {},
            onFavoriteButtonClicked = { _, _ -> }
        )
    }
}