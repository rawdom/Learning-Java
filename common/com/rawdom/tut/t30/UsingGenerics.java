package com.rawdom.tut.t30;

import java.util.ArrayList;
import java.util.HashMap;

public class UsingGenerics {

    public static void main(String[] args) {

        // //////Before java 5///////////
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(1);
        System.out.println(fruit);

        // //////////modern style////////////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);

        // /////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // ////Java 7
        ArrayList<Integer> someList = new ArrayList<>();

    }

}
