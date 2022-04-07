package com.cddrm.solid.single_responsibility.web_dev_simplified_demo;

/**
 * The idea of the Single Responsibility principle is that all of your classes, modules,
 * functions, anything inside your code that can be put into a single part. For example,
 * this CalorieTracker class should have one single responsibility.
 * That means it should have Only One Reason to Change. (be modified)
 * Our CalorieTracker has two reasons to change:
 * 1. When we need to change the code for how we track/calculate our calories, we need to modify
 *    the trackCalories method.
 * 2. If we want to change how we notify the user, say we want to email the user instead of logging
 *    out the messages to the console, we need to also modify the CalorieTracker class.
 *
 * Solution:
 * Take the logging portion out of the CalorieTracker class and move that into another class that
 * has only one responsibility, which is logging.
 */

public class BadCalorieTracker {

    private int maxCalories;
    private int currentCalories;

    public BadCalorieTracker(int maxCalories) {
        this.maxCalories = maxCalories;
        this.currentCalories = 0;
    }

    public void trackCalories(int calorieCount) {
        this.currentCalories += calorieCount;

        System.out.println(calorieCount +
                " calories has been added. Current total calories: " +
                this.currentCalories);

        if (this.currentCalories > this.maxCalories) {
            logCalorieSurplus();
        }
    }

    private void logCalorieSurplus() {
        System.out.println("Max calories exceeded.");
    }
}
