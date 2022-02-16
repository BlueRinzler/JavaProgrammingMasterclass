package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was one of the above");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'B';

        switch (charValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found");
                break;

            default:
                System.out.println("not found");
        }
        String month = "January";
        String heyMonth = month.toLowerCase();
        System.out.println(heyMonth);


    }
}
