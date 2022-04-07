package com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.external;

import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.User;

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
