package examples.square_function_example;

public class LambdaSquareFunction {

    public static void main(String[] args) {

        // As this interface has ONLY one method to implement, we can use the
        // lambda expression

        // Step 1:
        // IntegerFunction lambdaSquareFunction = (Integer i) -> i * i;

        // Step 2: the interface already tells us the parameter is an Integer
        // IntegerFunction lambdaSquareFunction = (i) -> i * i;

        // Step 3: if there is only one parameter
        IntegerFunction lambdaSquareFunction = i -> i * i;

        System.out.println(lambdaSquareFunction.apply(10));
    }
}
