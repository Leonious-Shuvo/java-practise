package com.leonious;

public class MegaByteConversion {
    public static void main(String[] args) {
        double megaByte = megaByteConversion(15);
        double kiloByte = kiloByteConversion(45);
        conversion(71);
        System.out.println("MegaByte = " + megaByte);
        System.out.println("KiloByte = " + kiloByte);

    }
    public static double megaByteConversion (double megaByteToGigaByte){
        if(megaByteToGigaByte < 0){
            return -1;
        }
        return (megaByteToGigaByte * 1024);
    }

    public static double kiloByteConversion (double kiloByteToMegaByte ){
        if(kiloByteToMegaByte <0){
            return -1;
        }
        return (kiloByteToMegaByte * 1024);
    }
    public static void conversion (double allConversion){
       if(allConversion <0 ){
           System.out.println("Invalid Value");
       }else{
           double allConversions = kiloByteConversion(allConversion);
           double allConversion2 = megaByteConversion(allConversion);
           System.out.println("kb to mb = " + allConversions + "mb to gb =" + allConversion2);
       }
    }


}
