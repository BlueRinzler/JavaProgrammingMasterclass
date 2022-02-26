package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myArray = readIntegers(5);
        System.out.println(Arrays.toString(myArray));
        System.out.println(finMin(myArray));
    }

    public static int[] readIntegers(int number) {

        int[] array = new int[number];
        System.out.println("Enter " + number + " numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;

    }

    public static int finMin(int[] array) {

        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        return temp;
    }


}
