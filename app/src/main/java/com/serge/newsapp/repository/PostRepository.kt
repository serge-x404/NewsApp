package com.serge.newsapp.repository

import com.serge.newsapp.retrofit.Post
import com.serge.newsapp.retrofit.RetrofitInstance

class PostRepository {

    // This class acts as a mediator between data-source(network API) & the viewModel

    private val apiService = RetrofitInstance.api

    suspend fun getPosts(): List<Post>{
        return apiService.getPosts()
    }

}