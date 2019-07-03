package com.example.footballapp.data

import android.util.Log
import com.example.footballapp.data.db.DbHelper
import com.example.footballapp.data.network.ApiHelper
import com.example.footballapp.data.prefs.PrefsHelper
import io.reactivex.Observable
import javax.inject.Inject

class AppDataManager @Inject constructor(val dbHelper: DbHelper, val prefs: PrefsHelper, val apiHelper: ApiHelper) :
    DataManager {
    override fun test() {
        Log.e("MainActivity", "AppDataManager run")
    }

    override fun performGetUsers(): Observable<*> = null!!

    override fun getCurrentUserName(): String? = ""

    override fun setCurrentUserName(userName: String?) {

    }

    override fun clearData() {
        prefs.clearData()
    }
}