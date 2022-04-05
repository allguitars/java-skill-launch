package com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.payment;

// Use this interface to provide a unified method signature
public interface PaymentProcessor {

    public void pay(long amountInDollars);
}
