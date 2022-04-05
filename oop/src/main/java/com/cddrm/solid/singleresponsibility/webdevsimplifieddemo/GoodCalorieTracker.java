package com.cddrm.solid.singleresponsibility.webdevsimplifieddemo;

/**
 * With this new implementation of the CalorieTracker, it has only one reason to change, which
 * is change how we are tracking the calories.
 */
public class GoodCalorieTracker {

    private int maxCalories;
    private int currentCalories;
    private Logger logger;

    public GoodCalorieTracker(int maxCalories) {
        this.maxCalories = maxCalories;
        this.currentCalories = 0;
        this.logger = new Logger();
    }

    public void trackCalories(int calorieCount) {
        this.currentCalories += calorieCount;

        System.out.println(calorieCount +
                " calories has been added. Current total calories: " +
                this.currentCalories);

        if (this.currentCalories > this.maxCalories) {
            logger.logMessage("Max calories exceeded.");  // Let the logging be handled by others class
        }
    }

//    private void logCalorieSurplus() {
//        System.out.println("Max calories exceeded.");
//    }
}
