package com.rajtechnolgies.java8.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

//CompletableFuture for asynchronous programming.
public class CompletableFutureEx {

    public static void main(String[] args) {

        CompletableFuture<String> future=CompletableFuture
                .supplyAsync(() -> "Hello" );
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        //thenApply()
        //
        //Transforms the result:

        CompletableFuture<String> future1=future.thenApply(String::toUpperCase);
        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        //thenAccept()
        //
        //Consumes the result:
        future1.thenAccept(System.out::println);

        //thenCompose()

        //Used when one asynchronous operation depends on another and returns another CompletableFuture.

        //Conceptually:

       // Future<A>
   //↓
      //  function A -> Future<B>
   //↓
       // Future<B>

        CompletableFuture<String> result =
                CompletableFuture
                        .supplyAsync(() -> "John")
                        .thenCompose(
                                name -> getUserDetails(name)
                        );
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        //thenCombine()
        //Combine 1 independent futures

        CompletableFuture<String> futureFirst=CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> futureSecond=CompletableFuture.supplyAsync(() -> "World");

            CompletableFuture<String> independentFuture=futureFirst.thenCombine(futureSecond, (f1,f2) -> f1+f2);
        try {
            System.out.println(independentFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }

    private static CompletionStage<String> getUserDetails(String name) {
        return CompletableFuture.completedFuture("Details of " + name);
    }
}
