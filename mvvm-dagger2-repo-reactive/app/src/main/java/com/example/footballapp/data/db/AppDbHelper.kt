package com.example.footballapp.data.db

import android.util.Log
import javax.inject.Inject

class AppDbHelper @Inject constructor() : DbHelper {
    override fun testdbHelper() {
        Log.e("AppDataManager", "AppDbHelper testdbHelper")

    }

}