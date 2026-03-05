package com.serge.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.serge.newsapp.screens.PostScreen
import com.serge.newsapp.ui.theme.NewsAppTheme
import com.serge.newsapp.viewmodel.PostViewModel

class MainActivity : ComponentActivity() {

    // ViewModel
    private val myViewModel: PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                Column() {
                    HeadingSection()
                    PostScreen(viewModel = myViewModel)
                }
            }
        }
    }
}


@Composable
fun HeadingSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "The News App",
            style = MaterialTheme.typography.displayMedium,
        )
        Text(
            "Stay and get updated",
            style = MaterialTheme.typography.labelSmall
        )
    }
}