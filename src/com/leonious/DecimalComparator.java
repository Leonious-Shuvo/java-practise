package com.leonious;

public class DecimalComparator {

    public static void main(String[] args) {
        boolean equal = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(equal);

    }
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){

        if((int) (numberOne * 1000) == (int) (numberTwo * 1000)){
            return true;
        }else {
            return false;
        }

    }
}
