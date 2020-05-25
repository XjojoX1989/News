package project.chris.news.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import project.chris.news.model.NewsListRepository
import project.chris.news.model.TopHeadlinesBean

/*
透過 ViewModel 可以將我們的 Repository 實體傳入以後，
透過 Repository 的方法來取得我們所需的資料
 */
class NewsListViewModel(private var repository: NewsListRepository) : ViewModel() {
    private val topHeadlinesLiveData = MutableLiveData<TopHeadlinesBean>()

    fun getTopHeadlines(): LiveData<TopHeadlinesBean> {

        repository.getTopHeadlinesData {
            topHeadlinesLiveData.postValue(it)
        }

        return topHeadlinesLiveData
    }

}