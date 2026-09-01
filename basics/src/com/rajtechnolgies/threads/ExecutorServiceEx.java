package com.rajtechnolgies.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {

    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(5);
        //executor service manages thread and assign tasks to them
        for(int i=0;i<5;i++) {

            int taskId=i;
            es.submit(()->{
                System.out.println("Task Id : "+taskId);
                System.out.println("Thread Id : "+Thread.currentThread().getId());
                System.out.println("Thread Name : "+Thread.currentThread().getName());
            });
        }
        es.shutdown();
    }
}
