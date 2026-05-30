package com.rajtechnolgies.main;
//public ==> the class can be accessed from anywhere
//class  ==> Define a class(a blueprint/object container)
//Main ==> name of the class
public class Main {
    //Everything inside this braces belongs to the main class
    public static void main(String[] args) {// This is the main method where java start running the program
      //public - Jvm can access it form outside the class
        // static - Can be called without creating an Object,
        //        - Means the method belongs to the class itself rather than an object.
        //        = No need to create the Object, With Static, the JVM can call it directly
        // void - Returns nothing
        // main - special method name recognized by Java
        //String[] args - Array of command line arguments
        System.out.println("Hello, World!");//Statement inside methods
        //System is the built in java class from the java.lang package
        //Provides access to system resources.
        //System.out ==> predefined output stream stream object, PrintStream
        //println - Method that prints text and moves to a new line.
    }
}
