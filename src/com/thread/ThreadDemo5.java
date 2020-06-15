package com.thread;

public class ThreadDemo5 {
    public synchronized void print1() {
        System.out.println("ThreadDemo5.print1()");
        print2();
    }

    public synchronized void print2() {
        System.out.println("ThreadDemo5.print2()");
        print3();
    }

    public synchronized void print3() {
        System.out.println("ThreadDemo5.print3()");
    }
}
