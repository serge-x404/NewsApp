package com.serge.newsapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.serge.newsapp.retrofit.Post

@Composable
fun PostList(post: List<Post>) {
    LazyColumn() {
        items(post) {
            it -> PostItem(it)
        }
    }
}