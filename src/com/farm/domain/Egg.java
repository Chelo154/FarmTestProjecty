package com.farm.domain;

public  class Egg {

    private Color color;

    public Egg(Color color){
        this.color = color;
    }

    public String info(){
        return color.symbol;
    }
}
