package com.company;

public class Chair {

    private String color;
    private String type;
    private int quantity;

    public Chair(String color, String type, int quantity) {
        this.color = color;
        this.type = type;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void pushIn() {
        System.out.println("All chairs pushed in");
    }
}
