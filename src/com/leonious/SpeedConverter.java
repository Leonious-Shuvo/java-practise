package com.leonious;

public class SpeedConverter {

    public static void main(String[] args) {
        double miles = toMilesPerHour(1.5);
        System.out.println("Miles= " + miles);
        printConversion(75.114);


    }
    public static long toMilesPerHour (double kilometersPerHour){


        if( kilometersPerHour < 0){
            return -1;
        }
       return Math.round(kilometersPerHour / 1.609);

    }
    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("invalid value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
