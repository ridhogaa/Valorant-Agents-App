package com.ergea.valorantagentsapp.ui.screen.favorite

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ergea.valorantagentsapp.R
import com.ergea.valorantagentsapp.di.Injection
import com.ergea.valorantagentsapp.model.Agent
import com.ergea.valorantagentsapp.ui.common.UiState
import com.ergea.valorantagentsapp.ui.components.AgentsItem
import com.ergea.valorantagentsapp.ui.components.EmptyContent
import com.ergea.valorantagentsapp.utils.ViewModelFactory

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun FavoriteScreen(
    modifier: Modifier = Modifier,
    viewModel: FavoriteViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Long) -> Unit,
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getFavoriteAgent()
            }
            is UiState.Success -> {
                FavoriteContent(
                    agents = uiState.data,
                    modifier = modifier,
                    onItemClick = navigateToDetail,
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun FavoriteContent(
    modifier: Modifier = Modifier,
    agents: List<Agent>,
    onItemClick: (id: Long) -> Unit,
) {
    Column {
        if (agents.isNotEmpty()) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(160.dp),
                contentPadding = PaddingValues(10.dp),
                horizontalArrangement = Arrangement.spacedBy(14.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                modifier = modifier
            ) {
                items(agents) { data ->
                    AgentsItem(
                        data.id,
                        data.image,
                        data.name,
                        data.role,
                        onItemClick,
                    )
                }
            }
        } else {
            EmptyContent(text = stringResource(id = R.string.empty_favorite), image = R.drawable.empty_favorite)
        }
    }
}