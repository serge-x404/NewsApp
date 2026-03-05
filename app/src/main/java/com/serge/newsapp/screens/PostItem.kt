package com.serge.newsapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.serge.newsapp.retrofit.Post
import com.serge.newsapp.utils.GenerateRandomColors

@Composable
fun PostItem(post: Post) {

    val backgroundColor = GenerateRandomColors().getRandomColor()

    Card(
        elevation = CardDefaults.elevatedCardElevation(2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        colors = CardDefaults.cardColors(backgroundColor)
    ) {
        Column(Modifier.padding(14.dp)
        ) {
            Text(
                post.title,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                post.body,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}