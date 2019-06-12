package com.example.footballapp.ui.main.matchList

import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider

class MatchFragmentViewModel(mDataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<MatchFragmentNavigator>(mDataManager, schedulerProvider) {
}