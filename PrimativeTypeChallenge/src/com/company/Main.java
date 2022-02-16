package com.company;

public class Main {

    public static void main(String[] args) {

        byte bValue = 10;
        short sValue = 20;
        int iValue = 50;
        long finalValue = (50000L + (10L * (bValue + sValue + iValue)));
        System.out.println(finalValue);

    }
}
