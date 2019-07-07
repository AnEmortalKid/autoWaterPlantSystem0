package com.autowaterplantsystem;

import java.util.concurrent.TimeUnit;

public class PrintStars {

    public static void printStars() throws InterruptedException {
        for(int i = 0; i< 40; i++){
            System.out.print("*");
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
    public static void printExclamationPoints() throws InterruptedException {
        for(int i = 0; i< 40; i++){
            System.out.print("!");
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
    public static void instantStars(){
        System.out.println("****************************************");
        System.out.println("");
    }

}
