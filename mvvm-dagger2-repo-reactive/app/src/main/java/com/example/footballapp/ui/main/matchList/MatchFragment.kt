package com.example.footballapp.ui.main.matchList

import android.os.Bundle
import android.view.View
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchListBinding
import com.example.footballapp.ui.base.BaseFragment
import javax.inject.Inject

class MatchFragment : BaseFragment<FragmentMatchListBinding, MatchFragmentViewModel>(), MatchFragmentNavigator {

    @Inject
    lateinit var mViewModel: MatchFragmentViewModel

    override fun getBindingVariable() = BR.viewModel_

    override fun getLayoutId() = R.layout.fragment_match_list

    override fun getViewModel() = mViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.setNavigator(this)
    }
}