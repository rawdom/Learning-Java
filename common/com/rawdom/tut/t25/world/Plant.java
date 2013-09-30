package com.rawdom.tut.t25.world;

public class Plant {

    // Bad practice
    public String name;

    private String type;
    // Acceptable aslong as final
    public final static int ID = 8;

    protected String size; // Same package and subclasses only

    int hieght;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.hieght = 8;
        this.size = "large";
    }

}
