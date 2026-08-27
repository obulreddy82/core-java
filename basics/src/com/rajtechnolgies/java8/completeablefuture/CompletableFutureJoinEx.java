package com.rajtechnolgies.java8.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureJoinEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello World";
           });
        System.out.println("Completable future end");
        System.out.println(future.get());
    }
}
