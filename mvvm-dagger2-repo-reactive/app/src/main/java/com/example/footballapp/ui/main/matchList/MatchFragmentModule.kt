package com.example.footballapp.ui.main.matchList

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class MatchFragmentModule {
    @Provides
    internal fun provideMatchFragmentViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
    ): MatchFragmentViewModel = MatchFragmentViewModel(dataManager, schedulerProvider)
}