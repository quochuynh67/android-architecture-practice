package com.example.footballapp.ui.main.myProfile

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class ProfileSettingModule {
    @Provides
    internal fun provideProfileSettingViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
    ): ProfileSettingViewModel = ProfileSettingViewModel(dataManager, schedulerProvider)
}