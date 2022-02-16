package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 10));
        System.out.println(calcFeetAndInchesToCentimeters(78));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0 && inches >= 0 && inches <= 12)) {
            return -1;
        } else {
            double feetToInches = feet * 12;
            return (feetToInches + inches) * 2.54;
        }
    }

        public static double calcFeetAndInchesToCentimeters (double inches) {
            double value;
            if (!(inches >= 0)) {
                return -1;
            } else {
                int feet = (int) (inches / 12);
                int remainderInches = (int) (inches % 12);
                value = calcFeetAndInchesToCentimeters(feet, remainderInches);

            }
            return value;
        }
    }

