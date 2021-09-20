package generic.solution.wild_cards;

public class NumericFunctions<T extends Number> {
    T num;

    public NumericFunctions(T ob) {
        this.num = ob;
    }

    // Use the Question Mark to tell that we don't know what type will it be.
    public boolean absEqual(NumericFunctions<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }
}
