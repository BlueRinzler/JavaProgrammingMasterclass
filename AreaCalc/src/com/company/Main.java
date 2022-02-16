package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));
    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }

    }
    public static double area (double length, double width) {
        if (length < 0 || width < 0) {
            return -1;
        } else {
            return length * width;
        }
    }
}
