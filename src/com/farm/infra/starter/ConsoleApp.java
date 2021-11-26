package com.farm.infra.starter;

import com.farm.infra.interfaces.App;

public class ConsoleApp implements App {

    @Override
    public void start() {
        System.out.println("Hello World");
    }
}
