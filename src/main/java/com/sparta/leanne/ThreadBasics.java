package com.sparta.leanne;

public class ThreadBasics implements Runnable{
    @Override
    public void run(){
        System.out.println("Printing from a thread");
    }

}
