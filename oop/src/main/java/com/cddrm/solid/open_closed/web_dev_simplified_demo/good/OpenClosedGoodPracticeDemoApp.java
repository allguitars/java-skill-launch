package com.cddrm.solid.open_closed.web_dev_simplified_demo.good;

import com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question.AbstractQuestion;
import com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question.BooleanAbstractQuestion;
import com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question.MultipleChoiceAbstractQuestion;
import com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question.RangeAbstractQuestion;
import com.cddrm.solid.open_closed.web_dev_simplified_demo.good.question.TextAbstractQuestion;

// https://youtu.be/-ptMtJAdj40 by Web Dev Simplified

/**
 * Solution:
 * We want to break this out into individual classes. say Boolean class, MultipleChoice class, and so on.
 * These classes are going to handle the printing inside them.
 * Then, in the quiz printing portion, we just call the "print" function provided by the individual class.
 * Later on when we need to add a new type, we just make a new class and we make that type know how to print itself.
 */

public class OpenClosedGoodPracticeDemoApp {

    public static void main(String[] args) {

        printQuestionContent(new BooleanAbstractQuestion("This video is useful."));
        printQuestionContent(new MultipleChoiceAbstractQuestion("What is your favorite language?", new String[]{"CSS", "HTML", "JS", "Python"}));
        printQuestionContent(new TextAbstractQuestion("Describe your favorite JS feature."));

        // The new added question type
        printQuestionContent(new RangeAbstractQuestion("What is your speed limit in your city?"));
    }

    // The question printing code block becomes really simple since
    // each type of question automatically knows what to do.
    private static void printQuestionContent(AbstractQuestion question) {
        System.out.println(question.getDescription());
        question.printQuestionChoices();
        System.out.println("");
    }

}
