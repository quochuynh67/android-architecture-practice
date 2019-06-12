package com.example.footballapp.ui.main

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun provideMainActivityViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
    ): MainActivityViewModel =
        MainActivityViewModel(dataManager, schedulerProvider)

    @Provides
    fun provideMainViewPagerAdapter(activity: MainActivity): MainViewPagerAdapter =
        MainViewPagerAdapter(activity.supportFragmentManager)
}