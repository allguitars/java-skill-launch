package com.cddrm.solid.openclosed.web_dev_simplified_demo.good.question;

public class TextQuestion extends Question{

    public TextQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("Answer: ________________");
    }
}
