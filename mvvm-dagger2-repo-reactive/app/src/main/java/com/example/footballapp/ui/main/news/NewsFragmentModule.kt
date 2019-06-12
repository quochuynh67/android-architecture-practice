package com.example.footballapp.ui.main.news

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class NewsFragmentModule {
    @Provides
    internal fun provideNewsFragmentViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
    ): NewsFragmentViewModel = NewsFragmentViewModel(dataManager, schedulerProvider)
}