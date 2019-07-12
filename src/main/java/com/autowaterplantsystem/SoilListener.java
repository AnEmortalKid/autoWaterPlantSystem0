package com.autowaterplantsystem;

import java.io.IOException;
import java.sql.SQLOutput;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SoilListener {

    private boolean positiveSignal = true;
    private boolean negativeSignal = false;


    Timer timer = new Timer();
    Pump pump;


    public SoilListener() throws InterruptedException {
        System.out.println("POWER ON - " +timer.getDateTime());
        TimeUnit.SECONDS.sleep(1);
        PrintStars.instantStars();
        System.out.println("");
    }

    public void listenForSignal() throws InterruptedException, IOException {

        while (true){
            System.out.println("");
            PrintStars.instantStars();
            PrintStars.instantStars();
            System.out.println(timer.getDateTime());
            System.out.println("checking for dry soil");
            TimeUnit.SECONDS.sleep(1);





            if(Soil.isDry()){
                System.out.println("");
                PrintStars.printExclamationPoints();
                System.out.println("");
                System.out.println(timer.getDateTime());

                System.out.println("soil is dry!");
                System.out.println("preparing to enable pump.");


                tenSecondPump();

                System.out.println("hibernating for 1 hour");
                PrintStars.printExclamationPoints();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                TimeUnit.HOURS.sleep(1);


            } else if (!Soil.isDry()) {
                System.out.println("");
                System.out.println(timer.getDateTime());
                System.out.println("soil is wet!");
                System.out.println("sleeping pump for 1 hour.");
                TimeUnit.HOURS.sleep(1);
            }


        }


    }

    private void tenSecondPump() throws InterruptedException, NullPointerException, IOException {

        Pump.turnOn();
        timer.setTimerSeconds(10);
        Pump.turnOff();

    }




}
