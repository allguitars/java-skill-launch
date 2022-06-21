package com.cddrm.solid.dependency_inversion.web_dev_simplified_demo;

import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.payment.PayPalPaymentProcessor;
import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.payment.PaymentProcessor;
import com.cddrm.solid.dependency_inversion.web_dev_simplified_demo.payment.StripePaymentProcessor;

// https://www.youtube.com/watch?v=9oHY5TllWaU&ab_channel=WebDevSimplified

/**
 * 主程式算是高階組件，PaymentProcessor 算是低階組件。
 * 在沒有實現依賴反轉的程式中，主程式會直接使用"具體"的 PaymentProcessor，例如
 * PayPalPaymentProcessor 或是 StripePaymentProcessor，整個上下游只有從上到下（高階到
 * 低階）的單一方向。
 * Main (高階組件對介面寫程式) -> PayPalPaymentProcessor (具體類別)
 *
 * 在依賴反轉的實現程式中，新增了一個抽象類別（介面），而具體的Payment類別實作了這個介面。
 * 實作的意義可視為一個依賴，所以這街具體付費類別由下到上依賴了這個介面。
 *
 * 而主程式相對於介面，則是由上到下的關係，因為在主程式中對介面寫程式，也就是依賴了這個介面。
 * 因此這整個依賴鏈，不再是單一方向。這就是依賴反轉。
 *
 * Main (高階組件對介面寫程式) -> PaymentProcessor (抽象類別或介面) <- PayPalPaymentProcessor (具體類別)
 *                                                            <- StripePaymentProcessor (具體類別)
 */


public class DependencyInversionDemo {

    public static void main(String[] args) {

        User user = new User("dave", "dave@cddrm.com");

        PaymentProcessor processor1 = new StripePaymentProcessor(user);  // using Stripe payment processor
        purchaseBike(processor1, 2);  // pass in the processor
        purchaseHelmet(processor1, 2);

        PaymentProcessor processor2 = new PayPalPaymentProcessor(user);  // using PayPal payment processor
        purchaseBike(processor2, 2);  // pass in the processor
        purchaseHelmet(processor2, 2);
    }

    // *** Code to the interface!! The argument being passed in is the interface type.
    // The PaymentProcessor interface provides a unified method and signature.
    // It allows the caller to keep the same way of using the payment API.

    private static void purchaseBike(PaymentProcessor paymentProcessor, int quantity) {
        paymentProcessor.pay(200 * quantity);
    }

    private static void purchaseHelmet(PaymentProcessor paymentProcessor, int quantity) {
        paymentProcessor.pay(15 * quantity);
    }
}
