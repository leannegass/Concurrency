package com.sparta.leanne;

public class App 
{
    public static void main( String[] args )
    {

        Thread thread1 = new Thread(new ThreadBasics());
        //Thread thread2 = new Thread(() -> System.out.println("Do something"));

        //thread2.start();
        Thread thread2 = new Thread(new ThreadJoin.Joins());
        thread2.setName("Thread 2");


        Thread thread3 = new Thread(new ThreadJoin.Joins());
        thread3.setName("Thread 3");


        Thread thread4 = new Thread(new ThreadJoin.Joins());
        thread4.setName("Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
//------------------------------------------------

        BankAccount bankAccount = new BankAccount();
        Thread husband = new Thread(bankAccount);
        Thread wife = new Thread(bankAccount);
        husband.setName("Husband");
        wife.setName("Wife");
        husband.start();
        wife.start();

    }
}
