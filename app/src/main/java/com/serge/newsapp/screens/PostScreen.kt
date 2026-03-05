package com.serge.newsapp.screens

import androidx.compose.runtime.Composable
import com.serge.newsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel) {

    val post = viewModel.posts
    PostList(post = post)
}