package com.example.footballapp.ui.splash

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class SplashModule {
    @Provides
    internal fun provideSplashViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) =
        SplashViewModel(dataManager, schedulerProvider)
}