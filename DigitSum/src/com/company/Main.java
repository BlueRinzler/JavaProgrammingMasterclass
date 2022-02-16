package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(212));

    }

    public static int sumDigits(int number) {
        if (!(number >= 10)) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            //extract least significant digit
            int digit = number % 10;
            sum += digit;
            // drop the least significant digit
            number /= 10;
        }
        return sum;
    }
}
