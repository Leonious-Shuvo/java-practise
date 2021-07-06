package com.leonious;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean check = hasEqualSum(5,4,9);
        System.out.println(check);

    }
    public static boolean hasEqualSum (int numberOne, int numberTwo, int numberThree){
        if ((numberOne + numberTwo) == numberThree){
            return true;
        }else {
            return false;
        }
    }
}
