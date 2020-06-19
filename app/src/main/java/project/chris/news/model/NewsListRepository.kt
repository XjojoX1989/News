package project.chris.news.model

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import project.chris.news.Constant
import project.chris.news.model.database.AppDataBase
import project.chris.news.model.database.ArticlesDao
import project.chris.news.network.ApiClientManager
import project.chris.news.network.ApiService
import project.chris.news.utils.CacheManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class NewsListRepository(private val context: Context) {
    val apiService = ApiClientManager.client.create(ApiService::class.java)

    fun getTopHeadlinesData(nextTask: (TopHeadlinesBean) -> Unit) {
        val date = SimpleDateFormat("yyyy/MM/dd").format(Date())
        val dtf = SimpleDateFormat("yyyy/MM/dd")
        val current = dtf.format(Date()) + Constant.COUNTRY
        if (CacheManager.instance!!.getNewsListFromCache(current) != null) {
            nextTask.invoke(CacheManager.instance!!.getNewsListFromCache(current)!!)
        } else {
            apiService.getTopHeadlines(Constant.COUNTRY, Constant.API_KEY).enqueue(object : Callback<TopHeadlinesBean> {
                override fun onResponse(call: Call<TopHeadlinesBean>, response: Response<TopHeadlinesBean>) {
                    if (response.body() != null) {
                        nextTask.invoke(response.body()!!)
                        CacheManager.instance!!.addNewsListToCache(current, response.body()!!)
                    }
                }

                override fun onFailure(call: Call<TopHeadlinesBean>, t: Throwable) {
                    Log.e("＊＊＊", "API fail")
                }
            })
        }
    }
    private var articlesDao: ArticlesDao
    private var favoriteArticles: LiveData<List<TopHeadlinesBean.ArticlesBean>>

    init {
        val db = AppDataBase.getDataBase(context)
        articlesDao = db.articleDao()
        favoriteArticles = articlesDao.getFavoriteArticles()
    }

    fun getFavoriteArticles(): LiveData<List<TopHeadlinesBean.ArticlesBean>> {
        return favoriteArticles
    }

    fun insertArticleToFavorite(article: TopHeadlinesBean.ArticlesBean) {
        AppDataBase.getDataBase(context).databaseWriteExecutor.execute {
            articlesDao.insertArticleToFavorite(article)
        }
    }

}