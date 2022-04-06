package com.cddrm.solid.openclosed.web_dev_simplified_demo.good.question;

abstract public class Question {

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

    abstract public void printQuestionChoices();

    public String[] getOptions() {
        return options;
    }

    public String getDescription() {
        return description;
    }
}
