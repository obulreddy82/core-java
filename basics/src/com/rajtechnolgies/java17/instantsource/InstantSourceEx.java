package com.rajtechnolgies.java17.instantsource;

import java.time.InstantSource;
import java.time.ZoneId;

public class InstantSourceEx {
    public static void main(String[] args) {
        InstantSource instantSource=InstantSource.system();
        System.out.println(instantSource.withZone(ZoneId.systemDefault()).instant());

    }
}
