package com.rajtechnolgies.java17.sealedclasses;

public class FamilySealedEx {
    public static void main(String[] args){
       Family father=new Father();
        father.print();
        Family mother=new Mother();
        mother.print();
        Father child1=new Child1();
        child1.print();
        Father child2=new Child2();
        child2.print();
        Child1 grandChild1=new GrandChild1();
        grandChild1.print();

    }
}

sealed class Family permits Father, Mother{
    public void print(){
        System.out.println("Family");
    }
}
//There are  3 types subclasses
sealed class Father extends Family permits Child1, Child2{
    public void print(){
        System.out.println("Father");
    }
}
final class Mother extends Family{
    public void print() {
        System.out.println("Mother");
    }
}

sealed class Child1 extends Father permits GrandChild1{
    public void print(){
        System.out.println("Child1");
    }
}

final class Child2 extends Father{
    public void print(){
        System.out.println("Child2");
    }
}

non-sealed class GrandChild1 extends Child1{
    public void print(){
        System.out.println("GrandChild1");
    }
}
