package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else this.tonerLevel = -1;
        this.duplex = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }

    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("In duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;


    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}



