package com.rajtechnolgies.java11;

public class StringEnhancementsEx {
    public static void main(String[] args) {
        //String enhancements
        //1. String.lines()
        //2. String.isBlank()
        //3. String.strip() //Java 11 introduced Unicode-aware whitespace removal.
        //4. String.repeat()
        //1.
        String s = "Hello \n World \n Learn String Enhancements";
        System.out.println(s.lines().count());
        //2.
        String blankTest="";
        String blankWithSpaceTest=" ";
        String emptyTest="";
        System.out.println(blankTest.isBlank());
        System.out.println(blankWithSpaceTest.isBlank());
        System.out.println(emptyTest.isEmpty());

        //3. Strip
        String stripTest="          Hello World         ";
        System.out.println(stripTest.stripLeading());

        //4.repeat
        System.out.println("Hello ".repeat(5));

    }
}
