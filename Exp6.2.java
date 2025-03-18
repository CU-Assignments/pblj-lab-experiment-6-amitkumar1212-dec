import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " - " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Alice", 80),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("David", 65),
            new Student("Eve", 85)
        ));

        System.out.println("Students scoring above 75% sorted by marks:");
        students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingDouble((Student s) -> -s.marks).thenComparing(s -> s.name))
            .forEach(Student::display);
    }
}
