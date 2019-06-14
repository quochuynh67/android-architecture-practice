package com.example.footballapp.ui.splash

import android.content.Intent
import android.os.Bundle
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.ActivitySplashBinding
import com.example.footballapp.ui.auth.AuthActivity
import com.example.footballapp.ui.base.BaseActivity
import com.example.footballapp.ui.main.MainActivity
import javax.inject.Inject

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(),
    SplashNavigator {


    @Inject
    lateinit var mViewModel: SplashViewModel

    override fun getBindingVariable() = BR.viewModel_
    override fun getLayoutId() = R.layout.activity_splash

    override fun getViewModel() = mViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel.setNavigator(this)
        //mViewModel.nextActivity()
    }

    override fun goToMainActivity() {
        startActivity(Intent(this, AuthActivity::class.java))
        finish()
    }
}