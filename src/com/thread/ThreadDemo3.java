package com.thread;

public class ThreadDemo3 extends Thread{
    private ThreadDemo1 td;
    public ThreadDemo3(ThreadDemo1 td) {
        this.td = td;
    }
    public void run(){
        td.addNum("b");
    }
}
