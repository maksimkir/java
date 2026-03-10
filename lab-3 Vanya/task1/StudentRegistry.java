package task1;
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<Integer, Student> registry = new HashMap<>();

    public void addStudent(Student student) {
        registry.put(student.getId(), student);
        System.out.println("Added: " + student);
    }

    public void removeStudent(int id) {
        Student removed = registry.remove(id);
        System.out.println(removed != null ? "Removed: " + removed : "Student not found");
    }

    public Student findStudent(int id) {
        return registry.getOrDefault(id, null);
    }

    public void printAll() {
        if (registry.isEmpty()) { System.out.println("Registry is empty"); return; }
        registry.values().forEach(System.out::println);
    }
}