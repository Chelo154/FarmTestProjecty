package com.farm.domain;

public enum Color {
    RED("RED","(R)"),
    WHITE("WHITE","(O)");

    String value;
    String symbol;

    Color(String value,String symbol){
        this.value = value;
        this.symbol = symbol;
    }
}