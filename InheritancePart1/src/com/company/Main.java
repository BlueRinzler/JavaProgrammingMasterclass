package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4,false,6,"yellow" , 1991);
        Supra supra = new Supra("yellow", 1994, true,4, "manual");
        supra.downShift();
        supra.move(99);
        System.out.println(supra.getWheels());



    }
}
