package com.farm.domain;

import java.util.ArrayList;

public class Carton {
    private ArrayList<Egg> eggs;
    private int maxSize;

    public Carton(){
        this.eggs = new ArrayList<Egg>();
        this.maxSize = 30;
    }

    public boolean isFull(){
        return this.eggs.size() == maxSize;
    }

    public void addEgg(Egg egg) {
        if(!isFull()) this.eggs.add(egg);
        else throw new MaximunEggsReachedException();
    }

    public String info(){
        StringBuilder info = new StringBuilder();
        int separator=0;
        int divider =5;

        for(Egg egg: eggs){
            info.append(egg.info());
            separator++;
            if(separator == divider){
                info.append("\n");
                separator=0;
            }
        }

        if(!isFull()){
            for(int i = eggs.size(); i < maxSize; i++){
                info.append("(E)");
                separator++;
                if(separator == divider){
                    info.append("\n");
                    separator=0;
                }
            }
        }

        return info.toString();
    }
}
