package project.chris.news.network

import project.chris.news.model.TopHeadlinesBean
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/v2/top-headlines")
    fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey:String
    ): Call<TopHeadlinesBean>
}