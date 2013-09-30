package com.rawdom.tut.t22;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void wipeWndShield() {
        System.out.println("Wipding windshield.");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }

}
