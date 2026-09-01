package com.rajtechnolgies.designpatterns.strategy.discount;

//The Strategy Pattern lets you define multiple interchangeable
// ways of doing something and choose which one to use at runtime.
public class StrategyPattern {
    //You can switch strategies:

    public static void main(String[] args) {

        ShoppingCart shoppingCart =new ShoppingCart(new StudentDiscount());
        double discount = shoppingCart.getTotal(100);
        System.out.println("Student Discount: "+discount);

        ShoppingCart shoppingCart1 =new ShoppingCart(new BlackFridayDiscount());
        double blackFridayDiscount= shoppingCart1.getTotal(100);
        System.out.println("Black Friday Discount: "+blackFridayDiscount);

    }

}
