package com.example.footballapp.ui.base

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import com.example.footballapp.data.DataManager
import com.example.footballapp.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

abstract class BaseViewModel<N>(private val schedulerProvider: SchedulerProvider) : ViewModel() {
    private val isLoading = ObservableBoolean(false)

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private lateinit var mNavigator: WeakReference<N>

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun getCompositeDisposable(): CompositeDisposable = compositeDisposable

    fun getSchedulerProvider(): SchedulerProvider = schedulerProvider

    fun getNavigator(): N? = mNavigator.get()

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }

    fun setIsLoading(loading: Boolean) = isLoading.set(loading)

    fun getIsLoading() = isLoading
}