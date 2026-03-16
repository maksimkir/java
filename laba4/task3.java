import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Олександр", "Іван", "Анастасія", "Максим");
        System.out.println("Результат: " + findLongestName(names).orElse("Список порожній"));
    }

    public static Optional<String> findLongestName(List<String> names) {
        return names.stream()
                .max(Comparator.comparingInt(String::length));
    }
}