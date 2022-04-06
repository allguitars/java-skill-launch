package com.cddrm.solid.openclosed.webdevsimplifieddemo.good.question;

public class Question {

    private String description;
    private String[] options;

    public Question(String description) {
        this.description = description;
        this.options = null;
    }

    public Question(String description, String[] options) {
        this.description = description;
        this.options = options;
    }

    public void printQuestionChoices() {
        // placeholder for the child class's override
    }

    public String[] getOptions() {
        return options;
    }

    public String getDescription() {
        return description;
    }
}
