package com.rawdom.tut.t18;

class Machine {
    private String name;
    private int code;

    public Machine() {
        this("John", 0);
        System.out.println("Constructor running! Number 1!");

    }

    public Machine(String name) {
        this(name, 0);
        System.out.println("Constructor running! Number 2!");

        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Constructor running! Number 3!");

        this.name = name;
        this.code = code;
    }

}

public class Constructors {

    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Weeew");
        Machine machine3 = new Machine("poop", 7);

    }

}
