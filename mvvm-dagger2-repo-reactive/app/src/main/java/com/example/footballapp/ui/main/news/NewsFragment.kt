package com.example.footballapp.ui.main.news

import android.os.Bundle
import android.view.View
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.ui.base.BaseFragment
import javax.inject.Inject

class NewsFragment : BaseFragment<com.example.footballapp.databinding.FragmentNewsBinding, NewsFragmentViewModel>(),
    NewsFragmentNavigator {

    @Inject
    lateinit var mViewModel: NewsFragmentViewModel

    override fun getBindingVariable() = BR.viewModel_

    override fun getLayoutId() = R.layout.fragment_news

    override fun getViewModel() = mViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.setNavigator(this)
    }

}