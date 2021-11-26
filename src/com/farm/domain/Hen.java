package com.farm.domain;

public class Hen {
    private Color color;

    public Hen(Color color){
        this.color = color;
    }

    public String sound(){
        return "CO CO CO CO ";
    }

    public void lay(Nest nest){
        nest.addEggs(new Egg[]{new Egg(color),new Egg(color)});
    }
}
