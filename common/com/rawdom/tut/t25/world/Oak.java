package com.rawdom.tut.t25.world;

public class Oak extends Plant {

    public Oak() {
        // This won't work -- type private
        // type = "tree";

        // This work -- size is protected, Oak is a subclass of plant
        this.size = "large";
        this.hieght = 10;
    }

}
