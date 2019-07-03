package com.example.footballapp.di.module

import android.app.Application
import android.content.Context
import com.example.footballapp.data.AppDataManager
import com.example.footballapp.data.DataManager
import com.example.footballapp.data.db.AppDbHelper
import com.example.footballapp.data.db.DbHelper
import com.example.footballapp.data.network.ApiHelper
import com.example.footballapp.data.network.AppApiHelper
import com.example.footballapp.data.prefs.AppPrefsHelper
import com.example.footballapp.data.prefs.PrefsHelper
import com.example.footballapp.di.PrefInfo
import com.example.footballapp.utils.rx.AppSchedulerProvider
import com.example.footballapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import com.example.footballapp.utils.AppConstants




@Module
class AppModule {
    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application


    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

    @Provides
    @Singleton
    fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }

    @Provides
    @Singleton
    fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }

    @Provides
    @PrefInfo
    fun providePreferenceName(): String {
        return AppConstants.PREF_NAME
    }


    @Provides
    @Singleton
    fun providePreferencesHelper(appPreferencesHelper: AppPrefsHelper): PrefsHelper {
        return appPreferencesHelper
    }

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

}