package com.company;

public class Room {

    private int length;
    private int width;
    private String floor;
    private String color;
    private Table table;


    public Room(int length, int width, String floor, String color, Table table) {
        this.length = length;
        this.width = width;
        this.floor = floor;
        this.color = color;
        this.table = table;
    }

    public void allChairs() {
        System.out.println("Number of chairs " + table.getChair());
    }

    public void fixTable() {
        System.out.println("Time to set the table");
        table.makeTable();
    }
}
