package com.company;

public class DecimalComparator {

    public static boolean arEqualByThreeDecimalPlaces (double value1, double value2) {

        int a = (int) (value1 * 1000);
        int b = (int) (value2 * 1000);

        if (a == b) {
            return true;
        }
        return false;


    }
}
