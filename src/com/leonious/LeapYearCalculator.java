package com.leonious;

public class LeapYearCalculator {


    public static void main(String[] args) {
        boolean leapYear = isLeapYear(1989);
        System.out.println(leapYear);

    }
    public static boolean isLeapYear (int year){
        if(year < 1 || year > 9999 || year % 4 != 0){
            return false;
        }else if((year % 100 ==0 && year % 400 == 0) || year % 100 !=0){
            return true;
        }return false;
    }
}
