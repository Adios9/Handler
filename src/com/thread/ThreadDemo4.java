package com.thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        ThreadDemo2 threadDemo2 = new ThreadDemo2(threadDemo1);
        ThreadDemo3 threadDemo3 = new ThreadDemo3(threadDemo1);
        threadDemo2.start();
        threadDemo3.start();
    }
}
