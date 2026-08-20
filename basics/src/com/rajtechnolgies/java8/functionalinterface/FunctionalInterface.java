package com.rajtechnolgies.java8.functionalinterface;

public class FunctionalInterface {

    public static void main(String[] args) {
        /**
         * Explanation:
         *
         * Above program demonstrates use of lambda expression with the Runnable functional interface.
         * Runnable has one abstract method run(), so it qualifies as a functional interface.
         * Lambda ()-> System.out.println("New thread created") defines the run() method.
         * new Thread().start() starts a new thread that executes the lambda body
         */

        new Thread(() -> System.out.println("New Thread Created")).start();

        //Without Functional interfaces
        //Anonymous classes to implement the run method
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread Created without Functional Interface");
            }
        }).start();
    }
}
