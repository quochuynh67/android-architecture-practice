package com.example.footballapp.data.network

import io.reactivex.Observable

interface ApiHelper {
    fun performGetUsers(): Observable<*>
}