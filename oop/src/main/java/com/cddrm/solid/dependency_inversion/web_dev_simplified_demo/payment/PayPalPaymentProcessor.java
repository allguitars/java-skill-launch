package com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.payment;

import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.external.PayPal;
import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.User;

// wrapper, aka facade or adapter class
public class PayPalPaymentProcessor implements PaymentProcessor {

    private User user;
    private PayPal payPal;

    public PayPalPaymentProcessor(User user) {
        this.user = user;
        this.payPal = new PayPal(user);
    }

    // provide the same method signature to the API caller
    public void pay(long amountInDollars) {

        // the actual use of the external API is different
        this.payPal.makePayment(this.user, amountInDollars);
    }
}
