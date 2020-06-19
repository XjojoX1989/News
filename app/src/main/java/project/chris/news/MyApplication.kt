package project.chris.news

import android.app.Application
import android.content.ComponentCallbacks2
import project.chris.news.utils.CacheManager

class MyApplication :Application(){

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        when(level){
            ComponentCallbacks2.TRIM_MEMORY_BACKGROUND,
            ComponentCallbacks2.TRIM_MEMORY_MODERATE,
            ComponentCallbacks2.TRIM_MEMORY_COMPLETE -> {

                CacheManager.instance!!.onTrimMemory()
            }
        }
    }
}