package com.cddrm.solid.dependencyinversion.webdevsimplifieddemo;

import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.payment.PayPalPaymentProcessor;
import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.payment.PaymentProcessor;
import com.cddrm.solid.dependencyinversion.webdevsimplifieddemo.payment.StripePaymentProcessor;

// https://www.youtube.com/watch?v=9oHY5TllWaU&ab_channel=WebDevSimplified

public class DependencyInversionDemo {

    public static void main(String[] args) {

        User user = new User("dave", "dave@cddrm.com");

        // using Stripe
        PaymentProcessor processor = new StripePaymentProcessor(user);

        purchaseBike(processor, 2);
        purchaseHelmet(processor, 2);

        // using PayPal
        processor = new PayPalPaymentProcessor(user);

        purchaseBike(processor, 2);
        purchaseHelmet(processor, 2);
    }

    // *** Code to the interface!!
    // The PaymentProcessor interface provides a unified method and signature.
    // It allows the caller to keep the same way of using the payment API.

    private static void purchaseBike(PaymentProcessor  paymentProcessor, int quantity) {
        // the same method and argument
        paymentProcessor.pay(200 * quantity);
    }

    private static void purchaseHelmet(PaymentProcessor paymentProcessor, int quantity) {
        // the same method and argument
        paymentProcessor.pay(15 * quantity);
    }
}
