package project.chris.news.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import project.chris.news.adapter.NewsListAdapter
import project.chris.news.databinding.FragmentNewsContentBinding
import project.chris.news.model.NewsListRepository
import project.chris.news.model.TopHeadlinesBean
import project.chris.news.viewmodel.NewsListFactory
import project.chris.news.viewmodel.NewsListViewModel

class NewsContentFragment : Fragment() {
    lateinit var binding:FragmentNewsContentBinding
    private lateinit var viewModel : NewsListViewModel
    private lateinit var repository: NewsListRepository
    private lateinit var factory: NewsListFactory

    private fun init() {
        repository = NewsListRepository(requireContext())
        factory = NewsListFactory(repository)
        viewModel = factory.create(NewsListViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewsContentBinding.inflate(inflater, container, false)
        init()
        viewModel.getFavoriteArticles().observe(viewLifecycleOwner, newsListObserver)

        return binding.root
    }

    private val newsListObserver = object:Observer<List<TopHeadlinesBean.ArticlesBean>>{
        override fun onChanged(data: List<TopHeadlinesBean.ArticlesBean>) {
            val adapter = NewsListAdapter(data, viewModel)
            binding.rvNewsList.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            binding.rvNewsList.adapter = adapter
            binding.prgressBar.visibility = View.GONE
        }
    }

}
