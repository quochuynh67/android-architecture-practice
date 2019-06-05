package com.example.footballapp.data.prefs

interface PrefsHelper {


    fun getCurrentUserName(): String?

    fun setCurrentUserName(userName: String?)

    //clear data
    fun clearData()

}