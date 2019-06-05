package com.example.footballapp.data.prefs

import android.content.Context
import android.content.SharedPreferences


class AppPrefsHelper constructor(private val context: Context, private val prefFileName: String) :
    PrefsHelper {


    companion object {
        private const val PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE"
        private const val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private const val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
        private const val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
        private const val PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL"
        private const val PREF_KEY_CURRENT_USER_PASSWORD = "PREF_KEY_CURRENT_USER_PASSWORD"
        private const val PREF_KEY_ACCESS_TOKEN_SNS = "PREF_KEY_ACCESS_TOKEN_SNS"

    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun getCurrentUserName(): String? = mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, "")

    override fun setCurrentUserName(userName: String?) =
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply()


    // clear data
    override fun clearData() = mPrefs.edit().clear().apply()

}