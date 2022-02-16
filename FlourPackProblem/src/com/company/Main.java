package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(5, 3, 24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bigCount == 0) {
            if (smallCount >= goal) {
                return true;
            } else {
                return false;
            }
        } else if (smallCount == 0) {
            if ((bigCount * 5) % goal == 0) {
                return true;
            } else {
                return false;
            }
        } else {

            int totalBigCount = goal / 5;
            int leftOver = (totalBigCount * 5) - (bigCount * 5);
            int remainderKilos = (goal % 5) + leftOver;
            if (totalBigCount < bigCount) {
                remainderKilos = goal % 5;
            }

            if (smallCount >= remainderKilos) {
                return true;
            } else {
                return false;
            }
        }
    }
}

