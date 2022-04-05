package com.cddrm.solid.singleresponsibility.webdevsimplifieddemo;

// By Web Dev Simplified
// https://youtu.be/UQqY3_6Epbg

public class CalorieTrackerDemoApp {

    public static void main(String[] args) {
        // BadCalorieTracker calorieTracker = new BadCalorieTracker(2000);
        GoodCalorieTracker calorieTracker = new GoodCalorieTracker(2000);

        calorieTracker.trackCalories(500);
        calorieTracker.trackCalories(1000);
        calorieTracker.trackCalories(700);
    }
}
