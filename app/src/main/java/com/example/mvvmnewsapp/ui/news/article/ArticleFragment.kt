package com.example.mvvmnewsapp.ui.news.article

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvvmnewsapp.R
import com.example.mvvmnewsapp.ui.news.NewsActivity
import com.example.mvvmnewsapp.ui.news.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {
    private lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}