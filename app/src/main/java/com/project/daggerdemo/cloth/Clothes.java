package com.project.daggerdemo.cloth;


public class Clothes {
    private Cloth mCloth;

    public Clothes(Cloth cloth) {
        mCloth = cloth;
    }

    public Cloth getCloth() {
        return mCloth;
    }

    public void setCloth(Cloth cloth) {
        mCloth = cloth;
    }

    @Override
    public String toString() {
        return mCloth.getColor() + "衣服";
    }
}
