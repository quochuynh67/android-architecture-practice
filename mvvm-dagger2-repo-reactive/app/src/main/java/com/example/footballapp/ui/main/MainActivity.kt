package com.example.footballapp.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.util.Log
import com.example.footballapp.BR
import com.example.footballapp.R
import com.example.footballapp.databinding.ActivityMainBinding
import com.example.footballapp.ui.base.BaseActivity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>()
    , MainActivityNavigator, HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentDispatchingAndroidInjector

    @Inject
    lateinit var mMainViewModel: MainActivityViewModel

    @Inject
    lateinit var mViewPagerAdapter: MainViewPagerAdapter

    override fun getBindingVariable() = BR.viewModel_

    override fun getLayoutId() = R.layout.activity_main

    override fun getViewModel() = mMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainViewModel.setNavigator(this)
        onInitView()
        mMainViewModel.testCommunicateWithDatamanagerFromView()
    }

    private fun onInitView() {
        //setup viewpager
        viewpager.adapter = mViewPagerAdapter
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                navigation.menu.getItem(position).isChecked = true
            }
        })


        //setup navigation
        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_news_tab -> {
                    Log.e("TestTest", "New tab")
                    viewpager.currentItem = 0
                }
                R.id.action_chat_tab -> {
                    Log.e("TestTest", "Chat tab")
                    viewpager.currentItem = 1

                }
                R.id.action_matches_tab -> {
                    Log.e("TestTest", "Matches tab")
                    viewpager.currentItem = 2

                }
                R.id.action_profile_tab -> {
                    Log.e("TestTest", "Profile tab")
                    viewpager.currentItem = 3
                }
            }
            true
        }
    }
}
