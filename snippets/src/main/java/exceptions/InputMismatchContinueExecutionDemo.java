package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchContinueExecutionDemo {

    public static void main(String[] args) {
        // test case: 10 20 e 40 0
        Scanner console = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;

        while (true) {
            // Now the try-catch block is located inside the while loop
            // Let the while loop continue the execution even you get an exception
            // the user will still get the average answer
            try {
                int number = console.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            } catch (InputMismatchException ex) {
                // next() method will get the next String from input because nextInt() rejected it.
                System.out.printf("Skip the non-integer input: %s%n", console.next());
            }
        }
        System.out.printf("Average: %.2f%n", sum / count); // This line will be executed.
    }
}
