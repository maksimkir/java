import java.util.*;

class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[ID='" + id + "', Name='" + name + "']";
    }
}

public class StudentRegistry {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(String id, Student s) { students.put(id, s); }
    public void removeStudent(String id) { students.remove(id); }
    public Student findStudent(String id) { return students.get(id); }
    public void displayAll() {
        students.forEach((id, s) -> System.out.println(id + ": " + s));
    }
}