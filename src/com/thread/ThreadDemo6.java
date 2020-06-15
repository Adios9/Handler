package com.thread;

public class ThreadDemo6 extends Thread{
    public void run() {
        ThreadDemo5 td = new ThreadDemo5();
        td.print1();
    }

    public static void main(String[] args)
    {
        ThreadDemo6 mt = new ThreadDemo6();
        mt.start();
    }
}
