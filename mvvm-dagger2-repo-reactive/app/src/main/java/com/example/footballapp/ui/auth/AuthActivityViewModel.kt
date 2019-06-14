package com.example.footballapp.ui.auth

import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider

class AuthActivityViewModel(mDataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<AuthActivityNavigator>(mDataManager, schedulerProvider) {
}