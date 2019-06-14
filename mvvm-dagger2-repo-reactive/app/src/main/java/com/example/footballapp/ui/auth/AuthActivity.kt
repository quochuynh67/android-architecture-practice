package com.example.footballapp.ui.auth

import android.os.Bundle
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.ActivityAuthBinding
import com.example.footballapp.ui.base.BaseActivity
import javax.inject.Inject

class AuthActivity : BaseActivity<ActivityAuthBinding, AuthActivityViewModel>(),
    AuthActivityNavigator {

    @Inject
    lateinit var mViewModel: AuthActivityViewModel

    override fun getBindingVariable() = BR.viewModel_

    override fun getLayoutId() = R.layout.activity_auth

    override fun getViewModel() = mViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel.setNavigator(this)
    }
}