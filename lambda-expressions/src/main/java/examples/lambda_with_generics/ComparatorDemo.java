package examples.lambda_with_generics;

public class ComparatorDemo {

    public static void main(String[] args) {

        // Using anonymous class to implement the method on the go while instantiating
        Comparator<String> byLength = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Math.abs(s1.length() - s2.length());
            }
        };

        String name1 = "Dave";
        String name2 = "Stanley";
        System.out.println(byLength.compare(name1, name2)); // 3
    }
}
