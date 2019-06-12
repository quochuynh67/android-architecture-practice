package com.example.footballapp.ui.main.myProfile

import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider

class ProfileSettingViewModel(mDataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<ProfileSettingNavigator>(mDataManager, schedulerProvider) {
}