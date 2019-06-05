package com.example.footballapp.di.modules

import com.example.footballapp.di.modules.app.appModule
import com.example.footballapp.di.modules.app.viewModelModule
import org.koin.core.module.Module

val appComponent: List<Module> = listOf(appModule, viewModelModule)