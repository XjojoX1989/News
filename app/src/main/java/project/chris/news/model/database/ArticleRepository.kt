package project.chris.news.model.database

import android.app.Application
import androidx.lifecycle.LiveData
import project.chris.news.model.TopHeadlinesBean

class ArticleRepository(private val application: Application) {
    private var articlesDao: ArticlesDao
    private var favoriteArticles: LiveData<List<TopHeadlinesBean.ArticlesBean>>

    init {
        val db = AppDataBase.getDataBase(application)
        articlesDao = db.articleDao()
        favoriteArticles = articlesDao.getFavoriteArticles()
    }

    fun getFavoriteArticles(): LiveData<List<TopHeadlinesBean.ArticlesBean>> {
        return favoriteArticles
    }

    fun insertArticleToFavorite(article: TopHeadlinesBean.ArticlesBean) {
        AppDataBase.getDataBase(application).databaseWriteExecutor.execute {
            articlesDao.insertArticleToFavorite(article)
        }
    }
}