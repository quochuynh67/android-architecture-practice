package com.example.footballapp.ui.main.myProfile

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProfileSettingProvider {
    @ContributesAndroidInjector(modules = [ProfileSettingModule::class])
    abstract fun provideProfileSettingFragmentFactory(): ProfileSettingFragment
}