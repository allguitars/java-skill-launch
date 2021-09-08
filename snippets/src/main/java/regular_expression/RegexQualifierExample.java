package regular_expression;

import java.util.regex.Pattern;

/**
 * Regex Quantifiers
 * The quantifiers specify the number of occurrences of a character.
 *
 * Regex	Description
 * X?	    X occurs once or not at all
 * X+	    X occurs once or more times
 * X*	    X occurs zero or more times
 * X{n}	    X occurs n times only
 * X{n,}	X occurs n or more times
 * X{y,z}	X occurs at least y times but less than z times
 */

public class RegexQualifierExample {

    public static void main(String[] args) {
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "amn"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammma"));//true (a or m or n may come zero or more times)
    }
}
