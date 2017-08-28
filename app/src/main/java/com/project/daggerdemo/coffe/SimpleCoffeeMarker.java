package com.project.daggerdemo.coffe;

import javax.inject.Inject;

/**
 * 制作咖啡的具体制作过程
 */
public class SimpleCoffeeMarker implements CoffeeMarker {
    private Cooker mCooker;
    @Inject
    public SimpleCoffeeMarker(Cooker cooker) {
        this.mCooker = cooker;
    }

    @Override
    public String makeCoffee() {

        return mCooker.make();
    }
}
