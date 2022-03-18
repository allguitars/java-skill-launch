package optional;

import java.util.Locale;
import java.util.Optional;

public class Demo06ObjectInteraction {

    public static void main(String[] args) {

        // case 1: the OLD way --> we will get a NullPointerException
        // Person person1 = new Person("Dave", null);
        // System.out.println(person1.getEmail().toLowerCase());

        // case 2:
        NewPerson person2 = new NewPerson("Dave", null);

        String email = person2.getEmail()
                .map(String::toLowerCase)
                .orElse("Email not provided");  // "Email not provided"

        System.out.println(email);

        // value is present
        NewPerson person3 = new NewPerson("Dave", "DAVE@gmail.com");

        email = person3.getEmail()
                .map(String::toLowerCase)            // dave@gmail.com
                .orElse("Email not provided");

        System.out.println(email);

        // if you don't want to chain methods and want to unwrap optionals yourself
        if (person3.getEmail().isPresent()) {
            email = person3.getEmail().get();
            System.out.println(email);               // "DAVE@gmail.com"
        } else {
            System.out.println("Email not provided");
        }
    }
}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class NewPerson {
    private final String name;
    private final String email;   // email can be nullable

    public NewPerson(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}