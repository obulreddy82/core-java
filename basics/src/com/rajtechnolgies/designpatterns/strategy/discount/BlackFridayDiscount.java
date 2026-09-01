package com.rajtechnolgies.designpatterns.strategy.discount;

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.3;
}
    }
