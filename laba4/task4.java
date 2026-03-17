import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;
    Employee(String n, double s) { name = n; salary = s; }
    @Override public String toString() { return name + " (" + salary + ")"; }
}

public class task4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Ivan", 2500), new Employee("Oleg", 4500),
            new Employee("Anna", 3500), new Employee("Maria", 6000)
        );
        System.out.println("Результат: " + groupBySalary(employees));
    }

    public static Map<String, Optional<Employee>> groupBySalary(List<Employee> list) {
        return list.stream().collect(Collectors.groupingBy(
            e -> e.salary < 3000 ? "< 3000" : (e.salary <= 5000 ? "3000-5000" : "> 5000"),
            Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))
        ));
    }
}