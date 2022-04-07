package com.cddrm.solid.openclosed.web_dev_simplified_demo.good.question;

abstract public class AbstractQuestion {

    private String description;
    private String[] options;

    public AbstractQuestion(String description) {
        this.description = description;
        this.options = null;
    }

    public AbstractQuestion(String description, String[] options) {
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
