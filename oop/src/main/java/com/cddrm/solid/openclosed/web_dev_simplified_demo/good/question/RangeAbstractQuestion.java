package com.cddrm.solid.openclosed.web_dev_simplified_demo.good.question;

public class RangeAbstractQuestion extends AbstractQuestion {

    public RangeAbstractQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("Minimum: _____");
        System.out.println("Maximum: _____");
    }
}
