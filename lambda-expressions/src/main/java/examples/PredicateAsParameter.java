package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAsParameter {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(6, 3, 5, 7, 9, 8, 3, 10, 5, 3);

        // test 1
        System.out.println("Test 1: grater than 5");
        printFilter(numList, (x) -> x > 5);
        // Test 2
        System.out.println("Test 2: even number");
        printFilter(numList, (x) -> x % 2 == 0);
        // Test 3, always print out the number
        System.out.println("Test 3: always true");
        printFilter(numList, (x) -> true);
    }

    public static void printFilter(List<Integer> nums, Predicate<Integer> condition) {
        for (Integer num : nums) {
            if (condition.test(num)) System.out.println(num);
        }
    }
}
