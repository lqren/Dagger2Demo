package com.project.daggerdemo.coffe;

/**
 * 咖啡机
 */
public class CoffeMachine {
    private CoffeeMarker mCoffeeMarker;//这个类是对咖啡制作过程的一个封装
    public CoffeMachine(CoffeeMarker coffeeMarker){
        mCoffeeMarker = coffeeMarker;

    }

    public String makeCoffe(){
        return mCoffeeMarker.makeCoffee();
    }
}
