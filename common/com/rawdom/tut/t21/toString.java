package com.rawdom.tut.t21;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        return String.format("%d: %s", id, name);
        /*
         * StringBuilder sb = new StringBuilder();
         * sb.append(id).append(": ").append(name); return sb.toString();
         */
    }
}

public class toString {

    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(2, "Due");

        System.out.println(frog1);
        System.out.println(frog2);

    }

}