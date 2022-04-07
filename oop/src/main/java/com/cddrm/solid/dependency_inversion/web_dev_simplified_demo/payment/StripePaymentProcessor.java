package com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.payment;

import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.external.Stripe;
import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.User;

// wrapper, aka facade or adapter class
public class StripePaymentProcessor implements PaymentProcessor {

    private User user;
    private Stripe stripe;

    public StripePaymentProcessor(User user) {
        this.user = user;
        this.stripe = new Stripe(user);
    }

    // provide the same method signature to the API caller
    public void pay(long amountInDollars) {

        // the actual use of the external API is different
        this.stripe.makePayment(amountInDollars * 100);
    }
}
