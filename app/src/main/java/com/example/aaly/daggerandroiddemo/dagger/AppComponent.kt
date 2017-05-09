package com.example.aaly.daggerandroiddemo.dagger


import com.example.aaly.daggerandroiddemo.App

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(modules = arrayOf(AndroidSupportInjectionModule::class, AppleFeatureBindingModule::class))
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
