package com.example.footballapp.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log
import com.example.footballapp.ui.main.chat.ChatFragment
import com.example.footballapp.ui.main.matchList.MatchFragment
import com.example.footballapp.ui.main.myProfile.ProfileSettingFragment
import com.example.footballapp.ui.main.news.NewsFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return NewsFragment()
            1 -> return ChatFragment()
            2 -> return MatchFragment()
            3 -> return ProfileSettingFragment()
        }
        Log.e("TestTest", "Fragment position $position created")
        return NewsFragment()
    }

    override fun getCount() = 4
}