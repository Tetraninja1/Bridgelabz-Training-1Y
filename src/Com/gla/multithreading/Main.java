package com.gla.multithreading;


public class Main {
    static void main() {
        System.out.println("Main start");

        MyThread mt = new MyThread();
        OtherThreading ot = new OtherThreading();
        Thread tt = new Thread(new ThirdThread());
        mt.start();
        ot.start();
        tt.start();
        System.out.println("Main ends");

    }
}
