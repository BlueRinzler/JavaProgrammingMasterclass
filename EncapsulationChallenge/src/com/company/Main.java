package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(100, false);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.printPages(7));
        System.out.println(printer.getPagesPrinted());
    }
}
