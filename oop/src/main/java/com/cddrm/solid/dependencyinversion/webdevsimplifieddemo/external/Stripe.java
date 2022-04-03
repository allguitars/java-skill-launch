package com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.external;

import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.User;

public class Stripe {

    private User user;

    public Stripe(User user) {
        this.user = user;
    }

    // The Stripe payment method requires only one argument

    public void makePayment(long amountInCents) {
        System.out.println(this.user.getName() + " made payment of " +
                amountInCents/100 + " dollars with Stripe");
    }
}
