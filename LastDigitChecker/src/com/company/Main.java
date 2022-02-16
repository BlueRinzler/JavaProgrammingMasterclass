package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(123,1003455,125));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }
//        if (number1 <= 10 || number1 >= 1000 || number2 <= 10 || number2 >= 1000 || number3 <= 10 || number3 >= 1000) {
//            return false;

        int firstNumberDigit = number1 % 10;
        int secondNumberDigit = number2 % 10;
        int thirdNumberDigit = number3 % 10;

        if (firstNumberDigit == secondNumberDigit || firstNumberDigit == thirdNumberDigit || secondNumberDigit == thirdNumberDigit || secondNumberDigit == firstNumberDigit) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isValid(int value) {
        if (value <= 10 || value >= 1000) {
            return false;
        } else {
            return true;
        }

    }
}
