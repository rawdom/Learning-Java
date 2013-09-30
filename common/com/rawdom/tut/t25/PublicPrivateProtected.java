package com.rawdom.tut.t25;

/*
 * private --- only within same class
 * public --- from anywhere
 * protected -- same class, subclass, and same package
 * no modifier --- same package only
 */
import com.rawdom.tut.t25.world.Plant;

public class PublicPrivateProtected {

    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

        // Won't work -- type is private
        // System.out.println(plant.type);
        // Wont work not same package.
        // System.out.println(plant.size);

    }

}
