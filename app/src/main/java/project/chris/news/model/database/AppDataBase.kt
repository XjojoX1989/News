package project.chris.news.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import project.chris.news.model.TopHeadlinesBean
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


@Database(entities = [TopHeadlinesBean.ArticlesBean::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun articleDao(): ArticlesDao
    private val NUMBER_OF_THREADS = 4

    val databaseWriteExecutor: ExecutorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS)

    companion object {
        var instance: AppDataBase? = null
        fun getDataBase(context: Context): AppDataBase {
            if (instance == null) {
                synchronized(this) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDataBase::class.java, "app_database"
                    )
                        .build()
                }
            }
            return instance!!
        }
    }
}