package com.leonious;

public class YearCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays (long minutes){
        if( minutes < 0){
            System.out.println("Invalid Value");
        }
        long day = minutes / (60*24);
        long year = day / 365;
        long rDay = day % 365;
        System.out.println(minutes + "min = " + year + " y and " + rDay + " d");

    }
}
