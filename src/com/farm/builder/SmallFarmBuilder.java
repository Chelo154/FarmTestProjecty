package com.farm.builder;

import com.farm.domain.Farm;
import com.farm.domain.Farmer;
import com.farm.domain.HenHouse;

public class SmallFarmBuilder implements FarmBuilder{

    private Farm farm;

    @Override
    public void buildFarm() {
        farm = new Farm();
    }

    @Override
    public void buildFarmer() {
        farm.addFarmer(new Farmer());
    }

    @Override
    public void buildHenHouse() {
        HenHouse henHouse = new HenHouse();

        for(int i = 0;i < 20; i++){
          henHouse.createNest();
        }
        farm.addHenHouse(henHouse);
    }

    @Override
    public void buildHenHouses(int quantity) {

    }

    @Override
    public Farm get() {
        return farm;
    }
}
