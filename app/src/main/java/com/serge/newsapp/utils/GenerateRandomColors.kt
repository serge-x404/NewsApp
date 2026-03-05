package com.serge.newsapp.utils

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class GenerateRandomColors {

    fun getRandomColor(): Color {
        val red = Random.nextInt(256)
        val green = Random.nextInt(256)
        val blue = Random.nextInt(256)

        return Color(red,green,blue)
    }
}