package com.example.footballapp.ui.main.chat

import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class ChatFragmentModule {
    @Provides
    internal fun provideChatFragmentViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
    ): ChatFragmentViewModel = ChatFragmentViewModel(dataManager, schedulerProvider)
}