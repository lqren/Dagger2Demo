package com.project.daggerdemo.cloth;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    public Games getGames(){
        Games games = new Games();
        games.setName("王者毒药");
        return games;
    }

    @Provides
    public Clothes getClothes(Cloth cloth){
        return new Clothes(cloth);
    }
}
