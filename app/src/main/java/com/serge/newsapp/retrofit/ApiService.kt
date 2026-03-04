package com.serge.newsapp.retrofit

import retrofit2.http.GET

interface ApiService {

    // Defining end-points

    @GET("posts")
    suspend fun getPosts(): List<Post>


}