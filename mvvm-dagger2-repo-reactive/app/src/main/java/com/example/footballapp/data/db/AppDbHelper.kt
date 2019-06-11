package com.example.footballapp.data.db

import android.util.Log

class AppDbHelper : DbHelper {
    override fun test() {
        Log.e("MainActivity","AppDbHelper run")
    }
}