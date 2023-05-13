package com.example.mvvmnewsapp.data.network.response

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)