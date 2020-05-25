package project.chris.news.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import project.chris.news.adapter.NewsListAdapter
import project.chris.news.databinding.FragmentNewsListBinding
import project.chris.news.model.NewsListRepository
import project.chris.news.model.TopHeadlinesBean
import project.chris.news.viewmodel.NewsListFactory
import project.chris.news.viewmodel.NewsListViewModel

class NewsListFragment : Fragment() {

    lateinit var binding: FragmentNewsListBinding
    private lateinit var viewModel : NewsListViewModel
    private lateinit var repository: NewsListRepository
    private lateinit var factory: NewsListFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewsListBinding.inflate(inflater, container, false)
        init()
        viewModel.getTopHeadlines().observe(viewLifecycleOwner, newsListObserver)
        return binding.root
    }

    private fun init() {
        repository = NewsListRepository(requireContext())
        factory = NewsListFactory(repository)
        viewModel = factory.create(NewsListViewModel::class.java)
    }

    private val newsListObserver = object: Observer<TopHeadlinesBean> {
        override fun onChanged(data: TopHeadlinesBean) {
            val adapter = NewsListAdapter(data.getArticles(), viewModel)
            binding.rvNewsList.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            binding.rvNewsList.adapter = adapter
            binding.prgressBar.visibility = View.GONE
        }
    }
}
