package Generics.Solution.TypeBounding;

public class Main {

    public static void main(String[] args) {
        NumericFunctions<Integer> iOb = new NumericFunctions<>(4);

        System.out.println(iOb.square());
    }
}
