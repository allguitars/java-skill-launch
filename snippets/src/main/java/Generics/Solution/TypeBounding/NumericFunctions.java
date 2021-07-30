package Generics.Solution.TypeBounding;

/**
 * Number can be:
 *  - Integer
 *  - Double
 *  - Float
 */
public class NumericFunctions<T extends Number> {   // Use keyword - extends to bound types
    T ob;

    public NumericFunctions(T ob) {
        this.ob = ob;
    }

    public double square() {
        return ob.intValue() * ob.doubleValue();
    }
}
