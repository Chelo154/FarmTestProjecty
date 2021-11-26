package com.farm.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Nest {
    private ArrayList<Egg> eggs;
    private Hen hen;
    private boolean free;

    public Nest(Hen hen){
        this.eggs = new ArrayList<>();
        this.hen = hen;
        this.free = false;
    }

    public Nest(){
        this.eggs = new ArrayList<>();
        this.free = true;
    }

    public void addHen(Hen hen){
        this.hen = hen;
        this.free = false;
    }

    public void addEggs(Egg []eggs){
        this.eggs.addAll(Arrays.asList(eggs));
    }

    public ArrayList<Egg> collect(){
        ArrayList<Egg> collectedEggs = new ArrayList<>(eggs);
        eggs.clear();
        return collectedEggs;
    }

    public boolean isFree() {
        return free;
    }

    public void layTime(){
        hen.lay(this);
    }
}
