package com.thread;

public class ThreadDemo2 extends Thread{
    private ThreadDemo1 td;
    public ThreadDemo2(ThreadDemo1 td) {
        this.td = td;
    }
    public void run(){
        td.addNum("a");
    }
}
