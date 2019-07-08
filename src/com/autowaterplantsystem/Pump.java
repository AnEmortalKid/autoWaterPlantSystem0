package com.autowaterplantsystem;

import java.io.IOException;

public class Pump {

    private static boolean powerOn = false;
    private static boolean powerOff = true;




    public static boolean turnOn() throws IOException {
        System.out.println("pump on" );
        powerOn=true;
        Runtime.getRuntime().exec("python/pumpOn.py");
        powerOff=false;
        return false;
    }

    public static void turnOff() throws IOException {
        System.out.println("pump off");
        Runtime.getRuntime().exec("python/pumpOff.py");
        powerOff=true;
        powerOn=false;
    }






}
