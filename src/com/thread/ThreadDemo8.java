package com.thread;

public class ThreadDemo8 extends Thread{
    private ThreadDemo7 td;

    public ThreadDemo8(ThreadDemo7 td) {
        this.td = td;
    }

    public void run() {
        td.testMethod();
    }

    public static void main(String[] args) {
        ThreadDemo7 td = new ThreadDemo7();
        ThreadDemo8 mt0 = new ThreadDemo8(td);
        ThreadDemo8 mt1 = new ThreadDemo8(td);
        mt0.start();
        mt1.start();
    }
}
