package com.example.githubreposapp.presentation.screens.common_components

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.theme.GithubReposAppTheme

@ExperimentalMaterial3Api
@Composable
fun AppBar(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
    color: Color = MaterialTheme.colorScheme.primary,
    showBackButton: Boolean = true,
    spacer:Boolean=true,

    onBackButtonClicked: () -> Unit = {},
) {

    Column {

        CenterAlignedTopAppBar(
            title = {
                Text(
                    stringResource(title),
                    style = titleStyle,
                )
            },
            modifier = modifier.background(color),
            navigationIcon = {
                if (showBackButton) {
                    IconButton(onClick = onBackButtonClicked) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_arrow)
                        )


                    }


                }
            }
        )


        if(spacer){
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.onSurfaceVariant)
            )
        }
    }

}
@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewAppBar() {
    GithubReposAppTheme {
        AppBar(title = R.string.details_app_bar_title) {

        }
    }
}