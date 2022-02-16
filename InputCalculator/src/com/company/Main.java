package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int value = scanner.nextInt();
                sum += value;
                count++;
                scanner.nextLine();
            } else {
                break;
            }
        }

        long avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

}
