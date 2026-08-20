package com.rajtechnolgies.java17;

import java.util.random.RandomGenerator;

public class EnhancedRandomNumberGen {
    public static void main(String[] args) {
        //Java 17 introduces new random number generator algorithms.
        RandomGenerator randomGenerator=RandomGenerator.getDefault();
        System.out.println("Random number"+randomGenerator.nextInt(100));
        //Benefits
        //
        //Better randomness
        //Multiple algorithms available
        //Suitable for simulations
    }
}
