package com.gla.multithreading;

public class OtherThreading extends Thread {
    @Override
    public void run() {
        for(char i='A';i<='J';i++){
            System.out.print(i+" ");
        }
    }
}
