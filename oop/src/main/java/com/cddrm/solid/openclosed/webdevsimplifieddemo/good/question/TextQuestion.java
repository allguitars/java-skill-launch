package com.cddrm.solid.openclosed.webdevsimplifieddemo.good.question;

public class TextQuestion extends Question{

    public TextQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("Answer: ________________");
    }
}
