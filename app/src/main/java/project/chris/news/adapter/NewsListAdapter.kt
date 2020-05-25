package com.chris.mvvmnews.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.chris.mvvmnews.view.NewsListFragmentDirections
import project.chris.news.databinding.NewsListItemBinding
import project.chris.news.model.TopHeadlinesBean

class NewsListAdapter(private val articles: List<TopHeadlinesBean.ArticlesBean?>?) :
    RecyclerView.Adapter<NewsListAdapter.NewsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: NewsListItemBinding = NewsListItemBinding.inflate(inflater, parent, false)
        return NewsListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsListViewHolder, position: Int) {
        holder.binding(articles?.get(position))
    }

    override fun getItemCount(): Int {
        if (!articles.isNullOrEmpty())
            return articles.size
        else return 0
    }

    class NewsListViewHolder(private val binding: NewsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setNewsItemClickListener {
                navigateToArticle(binding.articleBean?.url, it)
            }
        }

        private fun navigateToArticle(url: String?, view: View) {
            if (url!=null){
                val direction = NewsListFragmentDirections.actionNewsListFragmentToNewsContentFragment(url)
                view.findNavController().navigate(direction)
            }
        }

        fun binding(data: TopHeadlinesBean.ArticlesBean?) {
            binding.articleBean = data
        }
    }

}