package com.farm.domain;

public class MaximunEggsReachedException extends RuntimeException {
    public MaximunEggsReachedException(){
        super("Eggs Limit reached");
    }
}
