package com.example.footballapp.ui.main.news

import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider

class NewsFragmentViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<NewsFragmentNavigator>(dataManager, schedulerProvider) {
}