package com.example.footballapp.ui.main

import android.os.Bundle
import android.util.Log
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.ActivityMainBinding
import com.example.footballapp.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(), MainActivityNavigator {
    override fun test() {
        Log.e("MainActivity", "CLicked!!!!!")
    }

    @Inject
    lateinit var mMainViewModel: MainActivityViewModel

    override fun getBindingVariable() = BR.viewModel_

    override fun getLayoutId() = R.layout.activity_main

    override fun getViewModel() = mMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainViewModel.setNavigator(this)
    }
}
