package net.deathware.tut.t9;

import java.util.Scanner;

public class Switches {

    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Please enter a command: ");
        String text = input.nextLine();
        
        switch(text){
            case"start":
                System.out.println("Machine Started yo.");
                break;
            case "stop":
                System.out.println("Machine stopped aww.");
                break;
            default:
                System.out.println("Invalid command.");
        }
        
        

    }
}
