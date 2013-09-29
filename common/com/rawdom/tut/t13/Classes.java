package com.rawdom.tut.t13;

class Person {
    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)

    // Instance variables (data or "state")

    String name;
    int age;

}

public class Classes {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "John Faggot";
        person1.age = 37;

        Person person2 = new Person();

        person2.name = "Sarah Sucks Dick";
        person2.age = 20;

        System.out.println(person1.name);

    }

}
