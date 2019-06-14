package com.example.footballapp.ui.auth

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class AuthActivityModule {
    @Provides
    internal fun provideAuthActivityViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
    ): AuthActivityViewModel = AuthActivityViewModel(dataManager,schedulerProvider)
}