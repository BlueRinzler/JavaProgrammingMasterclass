package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000, 2.0));

        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        int count = 0;
        for (int i = 2; i < 10; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        int sum = 0;
        int realCount = 0;
        for (int b = 1; b <= 1000; b++) {
            if (b % 3 == 0 && b % 5 == 0) {
                sum += b;
                System.out.println("Number that is added " + b);
                realCount++;
            }
            if (realCount == 5) {
                break;
            }
        }
        System.out.println("Sum: " + sum);

    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}

