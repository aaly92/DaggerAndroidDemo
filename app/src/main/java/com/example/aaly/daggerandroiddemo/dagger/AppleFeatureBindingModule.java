package com.example.aaly.daggerandroiddemo.dagger;


import com.example.aaly.daggerandroiddemo.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class AppleFeatureBindingModule {
    @ContributesAndroidInjector(modules = { AppleModule.class})
    abstract MainActivity mainActivity();
}
