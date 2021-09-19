package map;

import java.util.HashMap;
import java.util.Map;

public class GetAllKeysValuesDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Keys should be unique, so it's reasonable that keys can be placed in a set
        System.out.println("All keys:");
        map.keySet().forEach(key -> System.out.println(key));

        System.out.println("All values:");
        // map.values().forEach(value -> System.out.println(value));
        // you can also use method reference instead of lambda
        map.values().forEach(System.out::println);

        // Use enforced for loop
        System.out.println("Using enforced for loop:");
        myForEach(map.keySet());   // keySet method returns a set
        myForEach(map.values());   // values method returns a collection
    }

    // As Set and Collection both are a kind of Iterable, so we can also use
    // the enforced for loop.
    static void myForEach(Iterable<String> iterable) {
        for (String element : iterable) {
            System.out.println(element);
        }
    }
}
