package com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.external;

import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.User;

public class PayPal {

    private User user;

    public PayPal(User user) {
        this.user = user;
    }

    // The PayPal payment method takes two arguments, including the user
    // This demonstrates how external APIs can be different

    public void makePayment(User user, long amountInDollars) {
        System.out.println(user.getName() + " made payment of " +
                amountInDollars + " dollars with PayPal");
    }
}
