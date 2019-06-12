package com.example.footballapp.ui.main.chat

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ChatFragmentProvider {
    @ContributesAndroidInjector(modules = [ChatFragmentModule::class])
    internal abstract fun provideChatFragmentFactory() : ChatFragment
}