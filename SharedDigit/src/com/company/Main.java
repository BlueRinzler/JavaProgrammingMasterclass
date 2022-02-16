package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,25));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        //find first digit
        int firstNumberDigit = number1 % 10;
        //find second digit
        int secondNumberDigit = 0;
        while (number1 > 0) {
            //extract least significant digit
            int secondDigit = number1 % 10;
            // drop the least significant digit
            number1 /= 10;
            secondNumberDigit = secondDigit;
        }
        //find third digit
        int thirdNumberDigit = number2 % 10;
        //find fourth digit
        int fourthNumberDigit = 0;
        while (number2 > 0) {
            //extract least significant digit
            int fourthDigit = number2 % 10;
            // drop the least significant digit
            number2 /= 10;
            fourthNumberDigit = fourthDigit;
        }
        if (firstNumberDigit == thirdNumberDigit || firstNumberDigit == fourthNumberDigit || secondNumberDigit == thirdNumberDigit || secondNumberDigit == fourthNumberDigit) {
            return true;
        } else {
            return false;
        }

    }
}
