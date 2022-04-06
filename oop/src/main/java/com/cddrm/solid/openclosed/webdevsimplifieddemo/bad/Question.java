package com.cddrm.solid.openclosed.webdevsimplifieddemo.bad;

import java.util.Arrays;

public class Question {
    private String type;
    private String description;
    private String[] options;

    public Question(String type, String description, String[] options) {
        this.type = type;
        this.description = description;
        this.options = options;
    }

    public Question(String type, String description) {
        this.type = type;
        this.description = description;
        this.options = null;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String[] getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", options=" + Arrays.toString(options) +
                '}';
    }
}
