package collection_and_map.immutability.of_methods;

import java.util.List;

public class ElementLayerWrongDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Justin";

        List<Student> students = List.of(student);

        System.out.println(students.get(0).name);   // Justin

        // The original can still be changed
        student.name = "Monica";

        // students list is not really immutable
        System.out.println(students.get(0).name);  // was changed to Monica
    }
}

class Student {
    String name;
}
