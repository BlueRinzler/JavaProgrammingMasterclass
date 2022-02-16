package com.company;

public class Supra extends Vehicle {

    private boolean turbo;
    private int generation;
    private String gearBox;

    public Supra(String color, int year, boolean turbo, int generation, String gearBox) {
        super(4, true, 6, color, year);
        this.turbo = turbo;
        this.generation = generation;
        this.gearBox = gearBox;
    }


    @Override
    public void move(int speed) {
        System.out.println("The supra is speeding " + speed);

    }
}
