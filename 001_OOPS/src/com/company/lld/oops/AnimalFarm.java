package com.company.lld.oops;

import java.util.List;

/**
 * Association, Aggregation
 */
public class AnimalFarm {
    private List<Animal> animalList;
    private FarmLand land;

    public AnimalFarm(List<Animal> animalList) {
        this.animalList = animalList;
    }
}

class FarmLand{
    private Integer length;
    private Integer breadth;

    public FarmLand(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
