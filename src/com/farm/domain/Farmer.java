package com.farm.domain;

import java.util.ArrayList;

public class Farmer {
    public ArrayList<Carton> cartons;

    public Farmer(){
        cartons = new ArrayList<>();
    }

    public ArrayList<Carton> collect(HenHouse henHouse){
        ArrayList<Egg> eggs = henHouse.collect();
        buildCartons(eggs);
        return cartons;
    }

    public ArrayList<Carton> getCartons() {
        return cartons;
    }

    private void buildCartons(ArrayList<Egg> eggs){
        Carton carton = new Carton();

        for(Egg egg : eggs){
            try{
                carton.addEgg(egg);
            }catch (MaximunEggsReachedException error){
                cartons.add(carton);
                carton = new Carton();
                carton.addEgg(egg);
            }
        }
        cartons.add(carton);
    }

}
