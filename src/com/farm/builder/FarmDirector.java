package com.farm.builder;

import com.farm.domain.Farm;

public class FarmDirector {
    private FarmBuilder farmBuilder;

    public FarmDirector(FarmBuilder farmBuilder){
        this.farmBuilder = farmBuilder;
    }

    public Farm make(String size){
        if(size.equals("small")){
           farmBuilder.buildFarm();
           farmBuilder.buildFarmer();
           farmBuilder.buildHenHouse();
        }
        if(size.equals("medium")){
            farmBuilder.buildFarm();
            farmBuilder.buildFarmer();
            farmBuilder.buildHenHouses(3);
        }

        return farmBuilder.get();
    }
}
