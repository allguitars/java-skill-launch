package generic.solution.example_two;

public class MyClassMultiVars<T, V> {
    T ob;
    V ob2;

    public MyClassMultiVars(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void showType() {
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}