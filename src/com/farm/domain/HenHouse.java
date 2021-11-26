package com.farm.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HenHouse {
    private ArrayList<Nest> nests;
    private int nestLimit;

    public HenHouse(){
        this.nests = new ArrayList<>();
        this.nestLimit = 50;
    }

    public void addHen(Hen hen){
        nests.stream().filter(Nest::isFree).findFirst().ifPresent(emptyNest -> emptyNest.addHen(hen));
    }

    public void createNest(){
        if(!isFull()) nests.add(new Nest());
    }

    public boolean isFull(){
        return nests.size() == nestLimit;
    }

    public void layTime(){
        nests.stream().filter(nest -> !nest.isFree()).collect(Collectors.toList()).forEach(Nest::layTime);
    }

    public ArrayList<Egg> collect(){
        ArrayList<Egg> eggs = new ArrayList<>();

        List<Nest> nestsWithHens =  nests.stream().filter(nest -> !nest.isFree()).collect(Collectors.toList());

        for(Nest nest: nestsWithHens){
            eggs.addAll(nest.collect());
        }

        return eggs;
    }
}
