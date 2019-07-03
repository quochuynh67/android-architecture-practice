package com.example.footballapp.data.network

import android.util.Log
import io.reactivex.Observable
import javax.inject.Inject

class AppApiHelper @Inject constructor() : ApiHelper {
    override fun performGetUsers(): Observable<*> {
        Log.e("AppDataManager", "AppApiHelper performGetUsers")
        return Observable.just("ABC")
    }
}