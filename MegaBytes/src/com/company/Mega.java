package com.company;

public class Mega {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kb = kiloBytes % 1024;
            int mb = Math.round((kiloBytes - kb) / 1000);
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
