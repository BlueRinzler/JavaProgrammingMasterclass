package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int count = getDigitCount(number);
            number = reverse(number);
            while (count > 0) {
                //extract least significant digit
                int digit = number % 10;
                //test the digit
                if (digit == 0) {
                    System.out.println("Zero");
                } else if (digit == 1) {
                    System.out.println("One");
                } else if (digit == 2) {
                    System.out.println("Two");
                } else if (digit == 3) {
                    System.out.println("Three");
                } else if (digit == 4) {
                    System.out.println("Four");
                } else if (digit == 5) {
                    System.out.println("Five");
                } else if (digit == 6) {
                    System.out.println("Six");
                } else if (digit == 7) {
                    System.out.println("Seven");
                } else if (digit == 8) {
                    System.out.println("Eight");
                } else if (digit == 9) {
                    System.out.println("Nine");
                }
                // drop the least significant digit
                number /= 10;
                count--;

            }

        }

    }

    public static int reverse(int number) {
        int negNumber = 0;
        if (number < 0) {
            number = (number * -1);
            negNumber = -1;
        }
        int reverse = 0;
        while (number > 0) {
            //extract least significant digit
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            // drop the least significant digit
            number /= 10;
        }
        if (negNumber == -1) {
            return reverse * -1;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            //extract least significant digit
            int digit = number % 10;
            count++;
            // drop the least significant digit
            number /= 10;

        }
        return count;
    }
}
