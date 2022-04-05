package com.cddrm.solid.singleresponsibility.webdevsimplifieddemo;

/**
 * The only reason we ever change this logger is if we change how we are logging.
 * For example, instead of just doing a console log, we could just email the user.
 */
public class Logger {

    public void logMessage(String message) {
        System.out.println(message);

        // or, email the user
    }
}
