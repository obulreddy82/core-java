package com.rajtechnolgies.java17.sealedclasses;

sealed interface Payment permits Upi, CreditCard, Cash, DebitCard {
    String getPaymentType();
}

non-sealed class Upi implements Payment {
    @Override
    public String getPaymentType() {
        return "UPI";
    }
}

final class CreditCard implements Payment {
    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}

sealed class Cash implements Payment permits DollerCashPayment {
    public String getPaymentType() {
        return "Cash";
    }
}

final class DollerCashPayment extends Cash {
    @Override
    public String getPaymentType() {
        return "Doller Cash";
    }
}


non-sealed class DebitCard implements Payment {
    @Override
    public String getPaymentType() {
        return "Debit Card";
    }
}

public class SealedInterfaceEx {
    public static void main(String[] args) {
        Payment upi = new Upi();
        Payment creditCard = new CreditCard();
        Payment cash = new Cash();
        Payment dollerCash = new DollerCashPayment();
        Payment debitCard = new DebitCard();
        System.out.println(upi.getPaymentType());
        System.out.println(creditCard.getPaymentType());
        System.out.println(cash.getPaymentType());
        System.out.println(dollerCash.getPaymentType());
        System.out.println(debitCard.getPaymentType());

    }
}
