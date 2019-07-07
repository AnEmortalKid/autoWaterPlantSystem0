package com.autowaterplantsystem;

public class Pump {

    private static boolean powerOn = false;
    private static boolean powerOff = true;




    public static boolean turnOn(){
        System.out.println("pump on" );
        powerOn=true;
        powerOff=false;
        return false;
    }

    public static void turnOff(){
        System.out.println("pump off");
        powerOff=true;
        powerOn=false;
    }






}
