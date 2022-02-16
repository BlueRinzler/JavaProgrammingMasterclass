package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int i = 0;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                System.out.println(number);
                i--;
            }
        }

        return i;


    }
}


