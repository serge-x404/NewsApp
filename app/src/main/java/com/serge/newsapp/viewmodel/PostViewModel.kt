package com.serge.newsapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serge.newsapp.repository.PostRepository
import com.serge.newsapp.retrofit.Post
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {

    private val repository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())
        private set     // Only PostViewModel is able to modify 'posts'

    init {
        viewModelScope.launch {

            // Fetching data
            val fetchPosts = repository.getPosts()

            //Updating state
            posts = fetchPosts
        }
    }
}