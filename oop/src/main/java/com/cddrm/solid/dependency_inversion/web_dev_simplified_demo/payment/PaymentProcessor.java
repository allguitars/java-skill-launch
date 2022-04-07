package com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.payment;

// Use this interface to provide a unified method signature
public interface PaymentProcessor {

    public void pay(long amountInDollars);
}
