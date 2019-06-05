package com.example.footballapp.data

import android.util.Log
import io.reactivex.Observable
import javax.inject.Inject

class AppDataManager @Inject constructor() : DataManager {
    override fun test() {
        Log.e("MainActivity","AppDataManager run")
    }

    override fun performGetUsers(): Observable<*> = null!!

    override fun getCurrentUserName(): String? =""

    override fun setCurrentUserName(userName: String?) {

    }

    override fun clearData() {

    }
}