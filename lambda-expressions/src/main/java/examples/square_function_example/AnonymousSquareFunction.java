package examples.square_function_example;

public class AnonymousSquareFunction {

    public static void main(String[] args) {

        // Using anonymous class to implement on the go for the new instance
        IntegerFunction squareFunction = new IntegerFunction() {
            @Override
            public Integer apply(Integer i) {
                return i * i;
            }
        };
        System.out.println(squareFunction.apply(10));
    }
}
