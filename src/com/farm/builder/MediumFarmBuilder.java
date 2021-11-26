package com.farm.builder;

import com.farm.domain.Farm;
import com.farm.domain.HenHouse;

public class MediumFarmBuilder implements FarmBuilder{
    private Farm farm;

    @Override
    public void buildFarm() {
        farm = new Farm();
    }

    @Override
    public void buildFarmer() {

    }

    @Override
    public void buildHenHouse() {
        HenHouse henHouse = new HenHouse();

        for(int i = 0;i < 40; i++){
            henHouse.createNest();
        }
    }

    @Override
    public void buildHenHouses(int quantity) {
        for(int i =0; i < quantity; i++) buildHenHouse();
    }

    @Override
    public Farm get() {
        return farm;
    }
}
