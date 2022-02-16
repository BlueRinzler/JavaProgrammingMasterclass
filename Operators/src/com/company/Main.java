package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println(result);

        result = result * 10; // 2 *10 = 20
        System.out.println(result);
        result = result / 5; // 20 /5 = 4
        System.out.println(result);

        result = result % 3; // remainder of (4 % 3) = 1
        System.out.println(result);

        result++; // 1+2 = 2
        System.out.println(result);
        result--;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("you win");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("ayy lmao");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        double firstD = 20.00d;
        double secondD = 80.00d;
        double output = (firstD + secondD) * 100.00d;
        double remainder = output % 40.00;
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }


    }
}
