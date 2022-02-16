package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 40));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int limit = summer ? 45 : 35;
        return (temperature >= 25 && temperature <= limit);
    }
}


