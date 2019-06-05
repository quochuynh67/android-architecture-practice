package com.example.footballapp.data

import io.reactivex.Observable

class AppDataManager : DataManager {
    override fun performGetUsers(): Observable<*> = null!!

    override fun getCurrentUserName(): String? =""

    override fun setCurrentUserName(userName: String?) {

    }

    override fun clearData() {

    }
}