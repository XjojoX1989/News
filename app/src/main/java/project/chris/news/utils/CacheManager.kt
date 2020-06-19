package project.chris.news.utils

import androidx.collection.ArrayMap
import project.chris.news.model.TopHeadlinesBean

object CacheManager {
    private val newsContentCache = ArrayMap<String, TopHeadlinesBean>()

    @Volatile
    var instance: CacheManager? = null
        get() {
            if (field == null) {
                synchronized(
                    CacheManager::class
                ) { if (field == null) field = CacheManager }
            }
            return field
        }
        private set

    fun addNewsListToCache(date:String, bean: TopHeadlinesBean){
        newsContentCache[date] = bean
    }

    fun getNewsListFromCache(date:String):TopHeadlinesBean?{
        return newsContentCache[date]
    }

    fun onTrimMemory() {
        newsContentCache.clear()
    }


}