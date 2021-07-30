package GetterForGetter;

public class Foo {
    private Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        return bar;
    }
}
