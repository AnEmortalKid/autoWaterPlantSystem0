package com.autowaterplantsystem;

import java.util.Date;
import java.util.concurrent.TimeUnit;




public class Timer {


    private boolean startTimer = false;
    private static boolean stopTimer = true;
    private Date currentDateTime;


    public Date getDateTime() {
        Date currentDateTime = new Date();
        this.currentDateTime = currentDateTime;
        return currentDateTime;
    }


    public void setTimerSeconds(long seconds) throws InterruptedException {
        System.out.println("starting timer at " + getDateTime()+ " for "+ seconds + " seconds");

        startTimer();

        TimeUnit.SECONDS.sleep(seconds);
        System.out.println("ending timer at " + getDateTime());

        stopTimer();

    }

    public void setTimerMinutes(long minutes) throws InterruptedException {
        System.out.println("starting timer at " + getDateTime());
        System.out.println("sleeping for " + minutes + " minutes");

        startTimer();
        TimeUnit.MINUTES.sleep(minutes);
        System.out.println("ending timer at " + getDateTime());
        stopTimer();

    }

    public void setTimerHours(long hours) throws InterruptedException {
        System.out.println("starting timer at " + getDateTime());
        System.out.println("sleeping for " + hours + " hours");

        startTimer();
        TimeUnit.HOURS.sleep(hours);
        System.out.println("ending timer at " + getDateTime());
        stopTimer();
    }

    public void setTimerCombied(long seconds, long minutes, long hours) throws InterruptedException {
        System.out.println("starting timer at " + getDateTime());

        System.out.println("sleeping for " + seconds + " seconds, " + minutes + " minutes " + hours + " hours.");
        startTimer();
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.HOURS.sleep(hours);
        System.out.println("ending timer at " + getDateTime());
        stopTimer();
    }


    public void startTimer() {
        this.startTimer = true;
        this.stopTimer = false;
    }


    public void stopTimer() {
        this.stopTimer = true;
        this.startTimer = false;
    }

    public boolean isTimerOn() {
        return startTimer;
    }

    public static boolean isTimerOff() {
        return stopTimer;
    }
}
