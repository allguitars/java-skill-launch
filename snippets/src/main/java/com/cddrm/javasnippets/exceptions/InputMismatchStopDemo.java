package com.cddrm.javasnippets.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchStopDemo {

    public static void main(String[] args) {
        // test 1: normal
        // 10 20 30 0

        // test 2: cause exception java.util.InputMismatchException
        // 10 20 e 40 0
        // with try-catch block, you can a get peaceful termination with exit code 0
        // you just have to take care of the exception

        try {
            Scanner console = new Scanner(System.in);
            double sum = 0.0;
            int count = 0;

            while (true) {
                int number = console.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            }

            System.out.printf("Average: %.2f%n", sum / count);
        } catch (InputMismatchException ex) {
            System.out.println("You must input integers.");
        }
    }
}
