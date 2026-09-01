package com.rajtechnolgies.designpatterns.strategy.discount;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    double getTotal(double price) {
        return discountStrategy.calculateDiscount(price);
    }
}
