package com.thread;

public class ThreadDemo7 {
    public synchronized void testMethod() {
        try {
            System.out.println("Enter ThreadDemo7.testMethod, currentThread = " + Thread.currentThread().getName());
            long l = Integer.MAX_VALUE;
            while (true) {
                long lo = 2 / l;
                Thread.sleep(1);
                l--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
