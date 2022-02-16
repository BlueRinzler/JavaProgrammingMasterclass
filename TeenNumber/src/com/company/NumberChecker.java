package com.company;

public class NumberChecker {

    public static boolean hasTeen(int value1, int value2, int value3) {
        boolean teen = false;
        if (value1 <= 19 && value1 >= 13) {
            teen = true;
        }
        if (value2 <= 19 && value2 >= 13) {
            teen = true;
        }
        if (value3 <= 19 && value3 >= 13) {
            teen = true;
        }
        return teen;
    }


    public static boolean isTeen(int age) {
        if (age <= 19 && age >= 13) {
            return true;
        }
        return false;
    }
}


