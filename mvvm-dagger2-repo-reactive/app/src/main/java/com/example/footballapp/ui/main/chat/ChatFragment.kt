package com.example.footballapp.ui.main.chat

import android.os.Bundle
import android.view.View
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentChatBinding
import com.example.footballapp.ui.base.BaseFragment
import javax.inject.Inject

class ChatFragment : BaseFragment<FragmentChatBinding, ChatFragmentViewModel>(),
    ChatFragmentNavigator {

    @Inject
    lateinit var mViewModel: ChatFragmentViewModel

    override fun getBindingVariable()= BR.viewModel_

    override fun getLayoutId() = R.layout.fragment_chat

    override fun getViewModel()=mViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.setNavigator(this)
    }
}