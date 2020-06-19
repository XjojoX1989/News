package project.chris.news.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import project.chris.news.R
import project.chris.news.databinding.NewsListItemBinding
import project.chris.news.model.TopHeadlinesBean
import project.chris.news.view.NewsListFragmentDirections
import project.chris.news.viewmodel.NewsListViewModel

class NewsListAdapter(
    private val articles: List<TopHeadlinesBean.ArticlesBean?>?,
    private val viewModel: NewsListViewModel
) :
    RecyclerView.Adapter<NewsListAdapter.NewsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: NewsListItemBinding = NewsListItemBinding.inflate(inflater, parent, false)
        return NewsListViewHolder(binding, viewModel, parent.context)
    }

    override fun onBindViewHolder(holder: NewsListViewHolder, position: Int) {
        holder.binding(articles?.get(position))
    }

    override fun getItemCount(): Int {
        if (!articles.isNullOrEmpty())
            return articles.size
        else return 0
    }

    class NewsListViewHolder(
        private val binding: NewsListItemBinding,
        private val viewModel: NewsListViewModel,
        private val context: Context
    ) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setNewsItemClickListener {
                navigateToArticle(binding.articleBean?.url, it)
            }
            binding.setAddArticleToFavoriteListener {
                viewModel.insertArticleToFavorite(binding.articleBean)
                binding.ivBookmark.setImageDrawable(context.resources.getDrawable(R.drawable.bookmark_on))
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