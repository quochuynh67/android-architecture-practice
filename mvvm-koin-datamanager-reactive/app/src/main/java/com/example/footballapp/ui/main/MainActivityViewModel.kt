package com.example.footballapp.ui.main

import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider

class MainActivityViewModel(schedulerProvider: SchedulerProvider) :
    BaseViewModel<MainActivityNavigator>(schedulerProvider) {
    fun onButtonClick(){
        getNavigator()!!.test()
    }
}