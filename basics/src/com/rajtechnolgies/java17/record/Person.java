package com.rajtechnolgies.java17.record;

public record Person(String name , int age) implements Print {

    public void print() {
        System.out.println("Person Name : "+name+" Age : "+age);
    }

    public static void main(String[] args) {
        Person person=new Person("Raj",20);
        person.print();
    }
}
