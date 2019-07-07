package com.autowaterplantsystem;

public class PopClient {


    private void test() throws InterruptedException {
        if (Pump.turnOn()) {
            sendMail();

        }
    }

    public void sendMail() throws InterruptedException {
        System.out.println("sending email");


    }


}
