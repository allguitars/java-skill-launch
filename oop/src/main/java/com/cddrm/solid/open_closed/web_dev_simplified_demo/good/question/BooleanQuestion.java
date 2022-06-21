package com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question;

public class BooleanQuestion extends AbstractQuestion {

    public BooleanQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("1. True");
        System.out.println("2. False");
    }
}
