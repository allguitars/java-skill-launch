package com.cddrm.solid.open_closed.web_dev_simplified_demo.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * We want to quiz printing code to be closed -- no need to change whenever we add a new question type
 * Open: means we have the ability to add new things, say a new question type
 * Closed: means there is no need to add code. The quiz printing should just automatically know what to do
 * A lot of times when we have the "switch" statement or a bunch of "if" statements, it is mostly a violation
 * of the open-closed principle.
 */

public class OpenClosedBadPracticeDemoApp {

    public static void main(String[] args) {

        // generate the quiz
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("boolean", "This video is useful."));
        questionList.add(new Question("multipleChoice", "What is your favorite language?", new String[]{"CSS", "HTML", "JS", "Python"}));
        questionList.add(new Question("text", "Describe your favorite JS feature."));

        /**
         * The following question with the new type will be added later.
         */
        // questionList.add(new Question("range", "What is your speed limit in your city?"));

        /**
         * The original switch case block does not have the "range" case
         * When we add a new question type to the list, we need to come to the switch case block
         * to add this case in order or to deal with the new-added type.
         */
        // Print out the quiz
        for (Question question : questionList) {
            System.out.println(question.getDescription());

            switch (question.getType()) {
                case "boolean":
                    System.out.println("1. True");
                    System.out.println("2. False");
                    break;
                case "multipleChoice":
                    String[] options = question.getOptions();
                    for (int i = 0; i < options.length; i++) {
                        System.out.println(i + 1 + ". " + options[i]);
                    }
                    break;
                case "text":
                    System.out.println("Answer: ________________");
                    break;
//                case "range":
//                    System.out.println("Minimum: _____");
//                    System.out.println("Maximum: _____");
//                    break;
                default:
                    System.out.println("There is no such option");
            }
            System.out.println("");
        }
    }
}
