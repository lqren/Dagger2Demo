package com.project.daggerdemo.cloth;

import com.project.daggerdemo.MainActivity;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent1 {
    void inject(MainActivity mainActivity);
}
