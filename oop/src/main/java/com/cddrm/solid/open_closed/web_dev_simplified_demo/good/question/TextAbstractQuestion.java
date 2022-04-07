package com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question;

public class TextAbstractQuestion extends AbstractQuestion {

    public TextAbstractQuestion(String description) {
        super(description);
    }

    @Override
    public void printQuestionChoices() {
        System.out.println("Answer: ________________");
    }
}
