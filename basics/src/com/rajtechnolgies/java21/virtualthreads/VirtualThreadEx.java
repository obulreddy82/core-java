package com.rajtechnolgies.java21.virtualthreads;

import java.util.concurrent.Executors;

public class VirtualThreadEx {

    //Virtual threads are light weight threads designed for high-concurrency applications
    public static void main(String[] args) {
        //Concurrency - to handle multiple tasks or processes simultaneously
        Thread.startVirtualThread(() -> System.out.println("Virtual Threads:" + Thread.currentThread()));

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            System.out.println("var type:" + executor);
            for (int i = 0; i < 10; i++) {
                int task = i;
                executor.submit(() -> System.out.println("task:" + task + ":Virtual Threads:" + Thread.currentThread()));
            }
        }
    }
}
