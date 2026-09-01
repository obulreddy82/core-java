package com.rajtechnolgies.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClasses {

    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread thread1=new Thread(counter);
        Thread thread2=new Thread(counter);
        synchronized (counter) {
            // Incrementing inside synchronized block
            counter.increment();
            counter.increment();
            counter.increment();
            counter.increment();
            counter.increment();
            counter.increment();
        }

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        synchronized (counter) {
            // Ensure thread-safe get call
            System.out.println("Final count: " + counter.getCount());
        }


//notify()
//
//Wakes one waiting thread.
       // notifyAll()

       // Wakes all waiting threads.
    }
}
