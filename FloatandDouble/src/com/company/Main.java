package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println(myMinDouble);
        System.out.println(myMaxDouble);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5.00 / 3.00;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);

        double pounds = 175d;
        double convert = pounds * 0.45359237;
        System.out.println(convert);
        


    }
}
