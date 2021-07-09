package com.leonious;

public class FeetConverter {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimetres(6,0);
        calcFeetAndInchesToCentimetres(157);

    }
    public static double calcFeetAndInchesToCentimetres (double feet, double inches){
        if((feet <0) || ((inches <0) || (inches >12))){
            System.out.println("invalid parameter");
            return -1;
        }
        double centimeters =(feet *12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm" );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimetres (double inches){
        if( inches < 0){
            System.out.println("Invalid inches");
            return -1;
        }
        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);
    }
}
