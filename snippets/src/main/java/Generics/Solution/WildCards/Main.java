package Generics.Solution.WildCards;

public class Main {

    public static void main(String[] args) {
        NumericFunctions<Integer> iOb = new NumericFunctions<>(6);
        NumericFunctions<Double> dOb = new NumericFunctions<>(-6.0);

        System.out.println(iOb.absEqual(dOb));
    }
}
