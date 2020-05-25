package project.chris.news.network
import okhttp3.OkHttpClient
import project.chris.news.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class ApiClientManager {
    private val retrofit: Retrofit
    private var okHttpClient: OkHttpClient

    init {
        okHttpClient = OkHttpClient().newBuilder().build()
        retrofit = Retrofit.Builder()
            .baseUrl(Constant.BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    companion object {
        private val manager = ApiClientManager()
        val client: Retrofit
            get() {
                return manager.retrofit
            }
    }
}