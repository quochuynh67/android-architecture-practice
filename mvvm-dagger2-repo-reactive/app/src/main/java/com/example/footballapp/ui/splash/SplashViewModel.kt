package com.example.footballapp.ui.splash

import android.util.Log
import com.example.footballapp.data.DataManager
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.utils.rx.SchedulerProvider
import io.reactivex.Completable
import java.util.concurrent.TimeUnit

class SplashViewModel(mDataManager: DataManager, schedulerProvider: SchedulerProvider) :
    BaseViewModel<SplashNavigator>(mDataManager, schedulerProvider) {
    fun nextActivity() {
        Completable.complete()
            .delay(1000, TimeUnit.MILLISECONDS)
            .doOnComplete(this::checkLogin)
            .subscribe()
    }

    private fun checkLogin() {
        getNavigator()?.goToMainActivity()
    }
}