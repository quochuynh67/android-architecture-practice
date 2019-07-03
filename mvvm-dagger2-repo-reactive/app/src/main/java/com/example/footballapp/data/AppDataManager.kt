package com.example.footballapp.data

import android.util.Log
import com.example.footballapp.data.db.DbHelper
import com.example.footballapp.data.network.ApiHelper
import com.example.footballapp.data.prefs.PrefsHelper
import io.reactivex.Observable
import javax.inject.Inject

class AppDataManager @Inject constructor(val dbHelper: DbHelper, val prefs: PrefsHelper, val apiHelper: ApiHelper) :
    DataManager {
    override fun testdbHelper() {
        Log.e("AppDataManager", "AppDataManager testdbHelper")
        dbHelper.testdbHelper()

    }

    override fun performGetUsers(): Observable<*> {
        Log.e("AppDataManager", "AppDataManager performGetUsers")
        return apiHelper.performGetUsers()
    }

    override fun getCurrentUserName(): String? = ""

    override fun setCurrentUserName(userName: String?) {

    }

    override fun clearData() {
        Log.e("AppDataManager", "AppDataManager clearData")
        prefs.clearData()
    }
}