import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " - " + age + " - " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 55000)
        ));

        System.out.println("Sorted by Name:");
        employees.stream()
            .sorted(Comparator.comparing(e -> e.name))
            .forEach(Employee::display);
        
        System.out.println("\nSorted by Age:");
        employees.stream()
            .sorted(Comparator.comparingInt(e -> e.age))
            .forEach(Employee::display);
        
        System.out.println("\nSorted by Salary:");
        employees.stream()
            .sorted(Comparator.comparingDouble(e -> -e.salary))
            .forEach(Employee::display);
    }
}
