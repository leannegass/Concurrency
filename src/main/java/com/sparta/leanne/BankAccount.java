package com.sparta.leanne;

public class BankAccount implements Runnable{
    private static int balance = 100;

    @Override
    public void run(){
        System.out.println(Util.getThreadName() + " check balance" + balance);
        makeWithdrawal(75);
        if (balance < 0){
            System.out.println("Acc has been overdrawn. Balance is " + balance);
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (balance >= amount){
            System.out.println(Util.getThreadName()+ " is going to withdraw");
            balance = balance - amount;
            System.out.println(Util.getThreadName()+ " is going to withdraw");
        }
        else{
            System.out.println("Sorry not enough balance" + Util.getThreadName());
        }

    }

}
