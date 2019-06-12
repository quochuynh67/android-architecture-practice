package com.example.footballapp.ui.main.chat

import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider

class ChatFragmentViewModel(mDataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<ChatFragmentNavigator>(mDataManager, schedulerProvider) {
}