package com.company;

import java.net.Inet4Address;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }
        int compareNumber = number;
        int reverse = 0;
        while (number > 0) {
            //extract least significant digit
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            // drop the least significant digit
            number /= 10;
        }


        if (reverse == compareNumber) {
            return true;
        } else {
            return false;
        }
    }
}

