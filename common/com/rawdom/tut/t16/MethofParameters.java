package com.rawdom.tut.t16;

class Robot {
    public void speak(String talk) {
        System.out.println(talk);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + "metres in direction "
                + direction);
    }
}

public class MethofParameters {

    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi I'm Sam.");
        sam.jump(7);
        sam.move("West", 12.2);

        String greeting = "Hello there.";
        sam.speak(greeting);

    }

}
