package com.example.footballapp.di.component

import android.app.Application
import com.example.footballapp.MainApp
import com.example.footballapp.di.builder.ActivityBuilder
import com.example.footballapp.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        (AndroidInjectionModule::class),
        (AppModule::class),
        (ActivityBuilder::class)]
)
interface AppComponent {

    fun inject(app: MainApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}