package com.rawdom.tut.t26;

public class Polymorphism {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();

        tree.shredLeavs();

        doGrow(tree);

        // plant2.shredLeaves();

    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }

}
