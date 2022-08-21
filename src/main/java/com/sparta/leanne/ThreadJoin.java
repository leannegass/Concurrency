package com.sparta.leanne;

public class ThreadJoin {
    static class Joins implements Runnable{
        @Override
        public void run(){
            for (int i = 1; i <= 5; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+ ' ' + i);
            }
        }
    }
}
