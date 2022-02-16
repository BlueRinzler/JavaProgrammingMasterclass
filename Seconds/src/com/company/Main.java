package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(71, 0));
        System.out.println(getDurationString(7892));
        System.out.println(getDurationString(-41));


    }

    public static String getDurationString(int minutes, int seconds) {
        if (!(minutes >= 0 && seconds >= 0 && seconds <= 59)) {
            return "Invalid Value";
        } else {
            int finalHours = minutes / 60;
            int finalMinutes = minutes % 60;
            String hoursString = finalHours + "h";
            if (finalHours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = finalMinutes + "m";
            if (finalMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + " " + minutesString + " " + secondsString ;

        }
    }

    public static String getDurationString(int seconds) {
        if (!(seconds >= 0)) {
            return "Invalid Value";
        } else {
            int finalMinutes = seconds / 60;
            int finalSeconds = seconds % 60;
            return getDurationString(finalMinutes, finalSeconds);

        }
    }

}

