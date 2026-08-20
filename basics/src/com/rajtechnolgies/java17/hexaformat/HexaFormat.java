package com.rajtechnolgies.java17.hexaformat;

import java.util.HexFormat;

public class HexaFormat {

    //Convert bytes to hexadecimal strings easily.

    public static void main(String[] args) {

        byte[] data = {10, 20, 30, 40, 50};

        String hex = HexFormat.of().formatHex(data);

        System.out.println(hex);
    }
}
