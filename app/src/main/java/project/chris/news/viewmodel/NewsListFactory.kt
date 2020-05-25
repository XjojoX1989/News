package project.chris.news.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import project.chris.news.model.NewsListRepository

/*
 Factory 的子類別用來外部生成 ViewModel 的一個工具類別，
 稍後我們可以透過它來產生一個 ViewModel 的實體物件
 */
class NewsListFactory(private var newsRepository: NewsListRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NewsListViewModel::class.java))
            return NewsListViewModel(newsRepository) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}