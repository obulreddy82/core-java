package com.rajtechnolgies.java17.sealedclasses;

sealed class Human permits Obul, Vijaya, Nithya, Hema {
    public void printName() {
        System.out.println("Default printName");
    }
}

sealed class Obul extends Human permits GrandChildObul {
    public void printName() {
        System.out.println("Obul printName");
    }
}

non-sealed class Vijaya extends Human {
    public void printName() {
        System.out.println("Vijaya printName");
    }
}

final class Nithya extends Human {
    public void printName() {
        System.out.println("Nithya printName");
    }
}

final class Hema extends Human {
    public void printName() {
        System.out.println("Hema printName");
    }
}

class GrandChildVijaya extends Vijaya {
    public void printName() {
        System.out.println("GrandChildVijaya printName");
    }
}

//class GrandChildObul extends Obul{
//    public void printName(){
//        System.out.println("GrandChildObul printName");
//    }
//}
final class GrandChildObul extends Obul {
    public void printName() {
        System.out.println("GrandChildObul printName");
    }
}

public class SealedHumanEx {
    public static void main(String[] args) {

        Human nithya = new Nithya();
        Human hema = new Hema();
        Human obul = new Obul();
        Human grandChildObul = new GrandChildObul();
        Human vijaya = new Vijaya();

        Human vijayaGrandChild = new GrandChildVijaya();

        vijaya.printName();
        vijayaGrandChild.printName();
        nithya.printName();
        hema.printName();
        obul.printName();
        grandChildObul.printName();
    }
}
