package com.cddrm.solid.openclosed.web_dev_simplified_demo.good.question;

public class BooleanAbstractQuestion extends AbstractQuestion {

    public BooleanAbstractQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("1. True");
        System.out.println("2. False");
    }
}
