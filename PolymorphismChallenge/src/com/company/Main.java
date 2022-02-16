package com.company;

class Car {

    public boolean engine;
    public int cylinders;
    public int wheels;
    public String name;
    public int howFast;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Starting engine");
    }

    public int accelerate(int speed) {
        System.out.println("The " + name + " is accelerating");
        return howFast += speed;
    }

    public int brake(int speed) {
        System.out.println("The car is braking");
        return howFast -= speed;
    }

    public int getHowFast() {
        return howFast;
    }
}

class Mustang extends Car {

    public Mustang(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public int accelerate(int speed) {
        System.out.println("go fast");
        return super.accelerate(speed);
    }

    @Override
    public int brake(int speed) {
        return super.brake(speed * 2);
    }
}


public class Main {

    public static void main(String[] args) {
        Mustang mustang = new Mustang("Mustang", 8);
        System.out.println(mustang.getWheels());
        mustang.accelerate(90);
        System.out.println(mustang.getHowFast());
        mustang.brake(40);
        System.out.println(mustang.getHowFast());
    }
}
