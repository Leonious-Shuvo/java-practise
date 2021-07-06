package com.leonious;

public class BarkingDog {
    public static void main(String[] args) {
        boolean barkingDog = shouldWakeUp(true,8);
        System.out.println(barkingDog);

    }
    public static boolean shouldWakeUp ( boolean barking, int hourOfDay ){

        if(hourOfDay <0 || hourOfDay > 23){
            return false;
        }else if((barking) && hourOfDay < 8 || hourOfDay > 22){
            return true;
        }else{
            return false;
        }
    }
}
