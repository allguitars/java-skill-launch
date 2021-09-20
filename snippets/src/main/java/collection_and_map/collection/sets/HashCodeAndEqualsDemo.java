package collection_and_map.collection.sets;

import java.util.HashSet;
import java.util.Set;

// The two "Dave" instances are considered as two unique objects even they have exactly the same
// information. This is because when you add a new instance to a HashSet, two methods, hasCode()
// and equals() will be called implicitly.
// hashCode() determines the hash code of this object and find its related hash bucket in the memory
// where it is going to be placed.
// When there is already another object located in the same hash bucket, equals() method will then
// be called to see if two objects are the same or not. If there are different objects, then
// the new object will be placed into this bucket, Now this buckets has two objects.
// So, if you want to define the condition where two objects will be considered the same or not,
// you need to override the hashCode() and equals() methods.

public class HashCodeAndEqualsDemo {

    public static void main(String[] args) {
        Set students = new HashSet();
        students.add(new Student("Dave", "100"));
        students.add(new Student("Stanley", "200"));
        students.add(new Student("Dave", "100"));

        System.out.println(students);
        // [Student{name='Dave', number='100'}, Student{name='Dave', number='100'}, Student{name='Stanley', number='200'}]
    }
}

class Student {
    private String name;
    private String number;

    Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}