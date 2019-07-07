package com.autowaterplantsystem;


public class Main {


    public static void main(String[] args) throws InterruptedException {


        SoilListener listener = new SoilListener();

        listener.listenForSignal();


    }

}
