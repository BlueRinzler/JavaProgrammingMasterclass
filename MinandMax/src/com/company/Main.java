package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNext = scanner.hasNextInt();

            if (hasNext) {
                int value = scanner.nextInt();
                scanner.nextLine();
//                if (first) {
//                    first = false;
//                    min = value;
//                    max = value;
//                }
                if (value > max) {
                    max = value;
                } else if (value < min) {
                    min = value;
                }

            } else {
                break;
            }

        }
        System.out.println(min);
        System.out.println(max);
        scanner.close();

    }

}

