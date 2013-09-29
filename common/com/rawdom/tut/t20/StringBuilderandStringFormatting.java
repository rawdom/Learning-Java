package com.rawdom.tut.t20;

public class StringBuilderandStringFormatting {

    public static void main(String[] args) {

        // Inefficient
        String info = "";

        info += "My name is bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);
        // More efficient.
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder("");
        s.append("My name is Roger.").append(" ").append("I am a skydiver.");
        System.out.println(s.toString());

        // Formating

        System.out
                .print("Here is a some text.\tThat was a tab.\nThat was a new line.");
        System.out.println(" More text.");

        System.out.printf("Total cost %-10d; Number is %d\n", 5, 120);
        // integers
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: %s\n", i, "here is some text");
        }
        // Floating
        System.out.printf("Total value: %.2f\n", 5.6454);
        System.out.printf("Total value: %-6.1f\n", 5.6454);

    }

}
