package com.project.daggerdemo.cloth;


public class Games {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "玩的游戏:"+ name;
    }
}
