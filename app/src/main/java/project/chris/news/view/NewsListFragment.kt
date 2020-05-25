package com.chris.mvvmnews.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.chris.mvvmnews.adapter.NewsListAdapter
import project.chris.news.databinding.FragmentNewsListBinding
import project.chris.news.model.NewsListRepository
import project.chris.news.model.TopHeadlinesBean
import project.chris.news.viewmodel.NewsListFactory
import project.chris.news.viewmodel.NewsListViewModel

class NewsListFragment : Fragment() {

    lateinit var binding: FragmentNewsListBinding
    private val newsListViewModel : NewsListViewModel by viewModels {
        generateViewModel()
    }

    private fun generateViewModel(): ViewModelProvider.Factory {
        val repository = NewsListRepository()
        return NewsListFactory(repository)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewsListBinding.inflate(inflater, container, false)
        newsListViewModel.getTopHeadlines().observe(viewLifecycleOwner, newsListObserver)
        return binding.root
    }

    private val newsListObserver = object:Observer<TopHeadlinesBean>{
        override fun onChanged(data: TopHeadlinesBean) {
            val adapter = NewsListAdapter(data.getArticles())
            binding.rvNewsList.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            binding.rvNewsList.adapter = adapter
            binding.prgressBar.visibility = View.GONE
        }
    }
}
