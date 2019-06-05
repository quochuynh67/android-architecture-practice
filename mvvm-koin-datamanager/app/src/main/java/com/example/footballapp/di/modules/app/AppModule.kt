package com.example.footballapp.di.modules.app

import com.example.footballapp.data.AppDataManager
import com.example.footballapp.data.db.AppDbHelper
import com.example.footballapp.data.network.AppApiHelper
import com.example.footballapp.data.prefs.AppPrefsHelper
import com.example.footballapp.ui.main.MainActivityViewModel
import com.example.footballapp.utils.AppConstants
import com.example.footballapp.utils.rx.AppSchedulerProvider
import com.example.footballapp.utils.rx.SchedulerProvider
import com.google.gson.GsonBuilder
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    //    single { androidApplication() }
    //network
    single { GsonBuilder().excludeFieldsWithoutExposeAnnotation().create() }
    single { AppApiHelper() }
    //prefs
    factory(named(name = AppConstants.PREF_NAME)) { AppConstants.PREF_NAME }
    single { AppPrefsHelper(get(), get(named(name = AppConstants.PREF_NAME))) }
    //db
    factory(named(name = AppConstants.DB_NAME)) { AppConstants.DB_NAME }
    single { AppDbHelper() }
    //data manager
    single { AppDataManager() }
    //rx
    factory<SchedulerProvider> { AppSchedulerProvider() }

}


val viewModelModule = module {

    viewModel { MainActivityViewModel(get()) }
}