package com.farm.main;

import com.farm.builder.FarmDirector;
import com.farm.builder.SmallFarmBuilder;
import com.farm.domain.*;

public class Main{
    public static void main(String[] args) {
        Farm farm = new FarmDirector(new SmallFarmBuilder()).make("small");

        farm.addHens(20);

        farm.layTime();

        for(Carton carton : farm.harvestHens()){
            System.out.println(carton.info());
        }
    }
}
