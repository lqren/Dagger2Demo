package com.project.daggerdemo.coffe;


public class Cooker {
    private String name;//咖啡师名字
    private String coffeeType;//咖啡类型
    public Cooker(String name,String coffeeType){
        this.name = name;
        this.coffeeType = coffeeType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String make() {
        return "咖啡师:" + name + "制作了" + coffeeType + "的咖啡";
    }
}
