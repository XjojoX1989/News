package project.chris.news.model.database

import androidx.lifecycle.LiveData
import androidx.room.*
import project.chris.news.model.TopHeadlinesBean

@Dao
interface ArticlesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertArticleToFavorite(article: TopHeadlinesBean.ArticlesBean);

    @Query("DELETE FROM ARTICLES_TABLE WHERE id = :title")
    fun deleteByTitle(title: String)

    @Query("SELECT * FROM ARTICLES_TABLE")
    fun getFavoriteArticles(): LiveData<List<TopHeadlinesBean.ArticlesBean>>
}