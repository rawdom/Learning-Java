package com.rawdom.tut.t7;

import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a line of text: ");
        //Wait for input
        String line = input.nextLine();
        //Relay data
        System.out.println("You entered: " + line+"\n\n\nEnter a number: ");
        
        int value = input.nextInt();
        System.out.println("The number is: "+value);
    }
}
