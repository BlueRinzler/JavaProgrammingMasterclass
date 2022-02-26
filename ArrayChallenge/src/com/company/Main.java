package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    //public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        //printArray(myArray);

        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers:\r");
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();


        }
        return myArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int [] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}
