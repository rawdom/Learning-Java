package com.rawdom.tut.t28;

public class CastingNumericalValues {

    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23225;

        float floatValue = 8834.3f;
        double doubleValue = 23.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int) floatValue;

        // Nah ah not happening.
        byteValue = (byte) 128;
        System.out.println(byteValue);

    }
}
