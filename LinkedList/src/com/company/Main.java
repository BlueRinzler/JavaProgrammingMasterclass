package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customerOne = new Customer("Sam", 54.96);
        Customer customerTwo = customerOne;
        customerTwo.setBalance(12.18);
        System.out.println("Balance for customer " + customerOne.getName() + " is " + customerOne.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }


}

