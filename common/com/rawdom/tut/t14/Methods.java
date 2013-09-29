package com.rawdom.tut.t14;

class Person {
    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)

    // Instance variables (data or "state")

    String name;
    int age;

    void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age
                + " years old.");
    }

    void sayHello() {
        System.out.println("Hello there!");
    }

}

public class Methods {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Faggot";
        person1.age = 37;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Sarah Sucks Dick";
        person2.age = 20;
        person2.speak();

        person1.sayHello();
    }

}
