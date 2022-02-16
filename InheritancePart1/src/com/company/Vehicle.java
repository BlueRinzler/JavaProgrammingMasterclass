package com.company;

public class Vehicle {

    private int wheels;
    private boolean coupe;
    private int engine;
    private String color;
    private int year;



    public Vehicle(int wheels, boolean coupe, int engine, String color, int year) {
        this.wheels = wheels;
        this.coupe = coupe;
        this.engine = engine;
        this.color = color;
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isCoupe() {
        return coupe;
    }

    public int getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void steering() {
        System.out.println("The vehicle is steering");
    }
    public void upShift() {
        System.out.println("Shift one gear up");
    }
    public void downShift() {
        System.out.println("Shift one gear down");
    }
    public void move(int speed) {
        System.out.println("The car is moving " + speed + "mph");
    }
}

