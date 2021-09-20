package generic.solution.example_two;

public class MoreThanOneVariable {

    public static void main(String[] args) {
        MyClassMultiVars<Integer, Double> mix = new MyClassMultiVars<>(10, 20.0);

        mix.showType();
    }
}
