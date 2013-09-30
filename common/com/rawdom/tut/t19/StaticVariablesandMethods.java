package com.rawdom.tut.t19;

class Thing {
    public final static int LUCKY_NUMBER = 164;

    public String name;
    public static String description;

    public static int count = 0;

    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object ID: " + id + ", " + description + ": "
                + name);
    }

    public static void showInfo() {
        System.out.println(description);
        // Won't work System.out.println(name);
    }
}

public class StaticVariablesandMethods {
    public static void main(String[] args) {
        Thing.description = "I am a thing";

        Thing.showInfo();
        System.out.println("There are " + Thing.count + " things.");

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);

        System.out.println("There are " + Thing.count + " things.");
    }

}
