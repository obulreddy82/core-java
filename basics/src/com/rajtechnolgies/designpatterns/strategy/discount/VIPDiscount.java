package com.rajtechnolgies.designpatterns.strategy.discount;

public class VIPDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
