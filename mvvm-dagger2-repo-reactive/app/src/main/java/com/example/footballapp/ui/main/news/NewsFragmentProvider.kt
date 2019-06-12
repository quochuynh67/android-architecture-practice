package com.example.footballapp.ui.main.news

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NewsFragmentProvider {
    @ContributesAndroidInjector(modules = [NewsFragmentModule::class])
    internal abstract fun provideNewsFragmentFactory(): NewsFragment
}