package com.example.aaly.daggerandroiddemo.dagger;


import dagger.Module;
import dagger.Provides;

@Module
public class AppleModule {
    @Provides
    String providesApple() {
        return "Apple";
    }
}
