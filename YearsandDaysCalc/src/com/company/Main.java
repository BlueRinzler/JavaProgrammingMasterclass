package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long totalDays = minutes / 1440L;
            long years = minutes / 525600L;
            if (minutes % 525600L == 0) {
                System.out.println(minutes + " min = " + years + " y" + " and 0 d");
            } else {
                long days = totalDays - (years * 365L);

                System.out.println(minutes + " min = " + years + " y" + " and " + days + " d");

            }

        }
    }
}
