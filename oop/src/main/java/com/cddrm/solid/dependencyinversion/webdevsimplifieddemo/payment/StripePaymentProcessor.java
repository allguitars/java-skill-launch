package com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.payment;

import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.external.Stripe;
import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.User;

// wrapper, aka facade or adapter class
public class StripePaymentProcessor implements PaymentProcessor {

    private User user;
    private Stripe stripe;

    public StripePaymentProcessor(User user) {
        this.user = user;
        this.stripe = new Stripe(user);
    }

    public void pay(long amountInDollars) {
        this.stripe.makePayment(amountInDollars * 100);
    }
}
