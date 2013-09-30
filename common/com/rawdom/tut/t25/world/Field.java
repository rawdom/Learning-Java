package com.rawdom.tut.t25.world;

public class Field {
    private Plant plant = new Plant();

    public Field() {

        // size is protected; FIeld is in the same package
        System.out.println(plant.size);
    }

}
