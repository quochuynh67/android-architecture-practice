package com.example.footballapp.di.builder

import com.example.footballapp.ui.main.MainActivity
import com.example.footballapp.ui.main.MainActivityModule
import com.example.footballapp.ui.main.chat.ChatFragmentProvider
import com.example.footballapp.ui.main.matchList.MatchFragmentProvider
import com.example.footballapp.ui.main.myProfile.ProfileSettingProvider
import com.example.footballapp.ui.main.news.NewsFragmentProvider
import com.example.footballapp.ui.splash.SplashActivity
import com.example.footballapp.ui.splash.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(
        modules = [ProfileSettingProvider::class,
            MatchFragmentProvider::class,
            ChatFragmentProvider::class,
            NewsFragmentProvider::class
            , MainActivityModule::class]
    )
    abstract fun bindMainActivity(): MainActivity


    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun bindSplashActivity(): SplashActivity
}