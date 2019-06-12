package com.example.footballapp.ui.main.myProfile

import android.os.Bundle
import android.view.View
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentProfileBinding
import com.example.footballapp.ui.base.BaseFragment
import javax.inject.Inject

class ProfileSettingFragment : BaseFragment<FragmentProfileBinding, ProfileSettingViewModel>(),
    ProfileSettingNavigator {

    @Inject
    lateinit var mViewModel: ProfileSettingViewModel

    override fun getBindingVariable() = BR.viewModel_

    override fun getLayoutId() = R.layout.fragment_profile

    override fun getViewModel() = mViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel.setNavigator(this)
    }
}