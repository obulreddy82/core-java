package com.rajtechnolgies.threads;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {

    private final AtomicInteger count =
            new AtomicInteger();

    void increment() throws InterruptedException {
        synchronized (this) {
            wait(); // Wait until notified
            count.incrementAndGet();
        }


    }

    int getCount() {
        synchronized (this) {
            notify(); // Notify a waiting thread
            return count.get();
        }

    }

    @Override
    public void run() {
        System.out.println("Counter is running");
    }
}
