package com.rajtechnolgies.java8.methodreferences;

import java.util.function.Supplier;

public class ConstructorMethodReference {

    public static void main(String[] args) {
        /**
         * A constructor reference is used to create a new object using a functional interface. It replaces a lambda expression that calls a constructor.
         *
         * Uses new keyword
         * Commonly used with Supplier, Function
         * Helps in object creation logic
         *
         * Supplier<Student> is a functional interface with get() method.
         * Student::new refers to the constructor of Student.
         * When supplier.get() is called, a new Student object is created.
         * Equivalent lambda expression:
         * Supplier<Student> supplier = () -> new Student();
         */
        Supplier<Student> student = Student::new;
        student.get();
    }
}

class Student{
    public Student(){
        System.out.println("Student object created");
    }
}
