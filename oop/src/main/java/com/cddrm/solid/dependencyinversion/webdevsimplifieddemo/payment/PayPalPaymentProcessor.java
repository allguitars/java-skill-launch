package com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.payment;

import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.external.PayPal;
import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.User;

// wrapper, aka facade or adapter class
public class PayPalPaymentProcessor implements PaymentProcessor {

    private User user;
    private PayPal payPal;

    public PayPalPaymentProcessor(User user) {
        this.user = user;
        this.payPal = new PayPal(user);
    }

    public void pay(long amountInDollars) {
        this.payPal.makePayment(this.user, amountInDollars);
    }
}
