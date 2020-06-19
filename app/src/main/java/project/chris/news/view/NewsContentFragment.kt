package project.chris.news.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import project.chris.news.adapter.NewsListAdapter
import project.chris.news.databinding.FragmentNewsContentBinding
import project.chris.news.model.NewsListRepository
import project.chris.news.model.TopHeadlinesBean
import project.chris.news.viewmodel.NewsContentViewModel
import project.chris.news.viewmodel.NewsListFactory
import project.chris.news.viewmodel.NewsListViewModel

class NewsContentFragment : Fragment() {
    lateinit var binding:FragmentNewsContentBinding
    private val args:NewsContentFragmentArgs by navArgs()
    private lateinit var newsUrl:String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewsContentBinding.inflate(inflater, container, false)
        binding.newsUrl = args.url
        return binding.root
    }



}
