package com.thread;

public class ThreadDemoOfRunnable {
    public static void main(String[] args) {
        new Thread(new ThreadRunnable()).start();
        for (int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + "----------" +i);
        }
    }
}