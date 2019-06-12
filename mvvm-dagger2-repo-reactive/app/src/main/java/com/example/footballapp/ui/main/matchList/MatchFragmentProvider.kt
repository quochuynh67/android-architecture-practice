package com.example.footballapp.ui.main.matchList

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MatchFragmentProvider {
    @ContributesAndroidInjector(modules = [MatchFragmentModule::class])
    internal abstract fun provideMatchFragmentFactory(): MatchFragment
}