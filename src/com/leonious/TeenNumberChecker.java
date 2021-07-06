package com.leonious;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean checkOne = hasTeen(9,99,19);
        boolean checkTwo = isTeen(13);
        System.out.println(checkOne);
        System.out.println(checkTwo);

    }
    public static boolean hasTeen (int ageOne, int ageTwo, int ageThree){

        if ( ageOne >=13 && ageOne <= 19 || ageTwo >=13 && ageTwo <=19 || ageThree >= 13 && ageThree <= 19 ) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean isTeen (int year){
        if(year >= 13 && year <= 19){
            return true;
        } else {
            return false;
        }
    }
}
