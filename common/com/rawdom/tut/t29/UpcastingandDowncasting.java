package com.rawdom.tut.t29;

class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class UpcastingandDowncasting {

    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting
        Machine machine2 = camera1;
        machine2.start();
        // machine2.snap();

        // Downcasting
        Machine machine3 = new Camera();
        Camera camer2 = (Camera) machine3;

        // No worky
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera) machine4;

    }

}
