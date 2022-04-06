package com.cddrm.solid.openclosed.webdevsimplifieddemo.good.question;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String description, String[] options) {
        super(description, options);
    }

    @Override
    public void printQuestionChoices() {

        for (int i = 0; i < this.getOptions().length; i++) {
            System.out.println(i+1 + ". " + this.getOptions()[i]);
        }
    }
}
