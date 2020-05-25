package project.chris.news.model

import android.util.Log
import project.chris.news.Constant
import project.chris.news.network.ApiClientManager
import project.chris.news.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsListRepository {
    val apiService = ApiClientManager.client.create(
        ApiService::class.java)

    fun getTopHeadlinesData(nextTask:(TopHeadlinesBean)->Unit) {
        apiService.getTopHeadlines("us",
            Constant.API_KEY
        ).enqueue(object : Callback<TopHeadlinesBean> {
            override fun onResponse(call: Call<TopHeadlinesBean>, response: Response<TopHeadlinesBean>) {
                if (response.body()!=null)
                    nextTask.invoke(response.body()!!)
            }

            override fun onFailure(call: Call<TopHeadlinesBean>, t: Throwable) {
                Log.e("＊＊＊","API fail")
            }
        })
    }


}