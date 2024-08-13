package com.example.githubreposapp.presentation.screens.GithubRepositories

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.R.drawable.img1

import com.example.githubreposapp.presentation.screens.common_components.AppBar
import com.example.githubreposapp.theme.GithubReposAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun GithubRepositories(
    onClick:()->Unit

) {
    Scaffold (modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        topBar = { AppBar(
            title = R.string.repository_screen_title,
            showBackButton = false,
            spacer = true

        )

        },



        ){inner->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(inner)
                .padding(30.dp)

            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center



        ){


            Image(
                painter = painterResource(id = R.drawable.img1),
                modifier = Modifier
//            .padding(15.dp)
                    .fillMaxWidth()
                    .height(330.dp)
                ,
                contentScale = ContentScale.Fit,
                contentDescription = " ");
            Text(text = stringResource(id =R.string.something_went_wrong ) ,

                overflow = TextOverflow.Clip,

                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleLarge.fontWeight

            );

            Text(text = stringResource(id = R.string.network_exception_meesage),
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(15.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize
            );

            Button(onClick = {  onClick},
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface),
                border = BorderStroke(3.dp, Color(0xFF31B057)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(top = 50.dp),
                shape = RoundedCornerShape(10)
            ) {

                Text(text = stringResource(id = R.string.retry),

                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    color = Color(0xFF31B057)

                )

            };


        }
    }

}


@ExperimentalMaterial3Api

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
private fun previewGithubRepositories() {
    GithubReposAppTheme {
        GithubRepositories({})
    }

}