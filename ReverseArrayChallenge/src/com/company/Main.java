package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);

    }

    public static void reverse(int[] array) {

        int size = array.length - 1;

        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[size - i];
            array[size - i] = temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
