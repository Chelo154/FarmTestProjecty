package com.farm.builder;

import com.farm.domain.Farm;

public interface FarmBuilder {

    public void buildFarm();

    public void buildFarmer();

    public void buildHenHouse();

    public void buildHenHouses(int quantity);

    public Farm get();
}
