package lambda.method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

// first, sort by last name, if the last name is the same, then sort by first name, and so on.
public class ComparatorDefaultMethodDemo {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Dave", "Lee", 204));
        customers.add(new Customer("Stanley", "Yeh", 101));
        customers.add(new Customer("Jason", "Lee", 300));

        // comparing() is a static method which already has implementation from the 'Function' interface,
        // which is a keyExtractor to extract the Comparable sort key
        // We use the getLastName() getter method to tell the key extractor which key to find
        Comparator<Customer> byLastName = Comparator.comparing(Customer::getLastName);

        // List.sort() takes in a Comparator instance
        // The thenComparing() method is a default method, so we need to use the Comparator instance
        // to call this method.
        // The thenComparing() also takes in a 'Function' instance, which is also a key extractor
        // We pass in the getFirstName() getter method as a reference so that the key extractor
        // knows which key to compare
        customers.sort(
                byLastName
                        .thenComparing(Customer::getFirstName)
                        .thenComparing(Customer::getZipCode)
        );

        customers.forEach(out::println);
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Integer zipCode;

    public Customer(String firstName, String lastName, Integer zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}