package com.cddrm.solid.openclosed.webdevsimplifieddemo.good.question;

public class BooleanQuestion extends Question {

    public BooleanQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("1. True");
        System.out.println("2. False");
    }
}
