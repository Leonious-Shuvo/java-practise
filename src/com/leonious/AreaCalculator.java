package com.leonious;

public class AreaCalculator {
    public static void main(String[] args) {
       area(5.0);
       area(5.0,4.0);

    }
    public static double area (double radius){
        if ( radius < 0){
            System.out.println("Invalid Value");
            return -1.0;
        }
        double CircleArea = radius * radius *Math.PI;
        System.out.println("The circle area is = " + CircleArea);
        return CircleArea;
    }
    public static double area (double x, double y){
        if(( x <0) || (y<0)) {
            System.out.println("Invalid Value");
            return -1;
        }
        double rectangleArea =  x * y;
        System.out.println("The Rectangle Area = " + rectangleArea);
        return rectangleArea;
    }
}
