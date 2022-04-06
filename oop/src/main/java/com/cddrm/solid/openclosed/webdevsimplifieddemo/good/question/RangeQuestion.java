package com.cddrm.solid.openclosed.webdevsimplifieddemo.good.question;

public class RangeQuestion extends Question {

    public RangeQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("Minimum: _____");
        System.out.println("Maximum: _____");
    }
}
