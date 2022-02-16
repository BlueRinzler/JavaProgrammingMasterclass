package com.company;

public class Table {

    private Chair chair;
    private String type;
    private int length;
    private int width;

    public Table(Chair chair, String type, int length, int width) {
        this.chair = chair;
        this.type = type;
        this.length = length;
        this.width = width;
    }

    public int getChair() {
        return chair.getQuantity();
    }

    public void makeTable() {
        chair.pushIn();
    }



}
