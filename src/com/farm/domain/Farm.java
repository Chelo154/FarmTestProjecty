package com.farm.domain;

import java.util.ArrayList;

public class Farm {
    private Farmer farmer;
    private ArrayList<HenHouse> henHouses;

    public Farm(){
        this.henHouses = new ArrayList<>();
    }

    public void addHenHouse(HenHouse henHouse){
        henHouses.add(henHouse);
    }

    public void addFarmer(Farmer farmer){
        this.farmer = farmer;
    }

    public void addHens(int quantity){
        int redHens = (int) (quantity * 0.7);
        int whiteHens = (int) (quantity *0.3);

        for(HenHouse henHouse: henHouses){
                for(int i = 0; i < quantity; i++){
                    if(i < redHens) henHouse.addHen(new Hen(Color.RED));
                    else henHouse.addHen(new Hen(Color.WHITE));
                }
        }
    }

    public void layTime(){
        henHouses.forEach(HenHouse::layTime);
    }

    public ArrayList<Carton> harvestHens(){
        ArrayList<Carton> cartons = new ArrayList<>();

        for(HenHouse henHouse: henHouses){
            cartons.addAll(farmer.collect(henHouse));
        }

        return cartons;
    }
}
