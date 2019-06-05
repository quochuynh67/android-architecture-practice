package com.example.footballapp.ui.main

import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider
import javax.inject.Inject

class MainActivityViewModel(dataManager: DataManager,schedulerProvider: SchedulerProvider) :
    BaseViewModel<MainActivityNavigator>(dataManager, schedulerProvider) {
    fun onButtonClick(){
//        getNavigator()!!.test()
        getDataManager()?.test()
    }
}