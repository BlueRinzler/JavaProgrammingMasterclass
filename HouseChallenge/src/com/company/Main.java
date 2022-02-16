package com.company;

public class Main {

    public static void main(String[] args) {

        Table theTable = new Table(new Chair("Black", "Wood", 4),"Wood", 200, 200);
	    Room theRoom = new Room(1000,1000,"Wood", "Tan", theTable);

        theRoom.allChairs();
        theRoom.fixTable();
    }
}
