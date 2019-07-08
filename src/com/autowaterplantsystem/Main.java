package com.autowaterplantsystem;


import java.io.IOException;

public class Main {


    public static void main(String[] args) throws InterruptedException, IOException {


        SoilListener listener = new SoilListener();

        listener.listenForSignal();




    }

}
