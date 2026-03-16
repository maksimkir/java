import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class task1 {
    public static Optional<String> findFirstX(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("X") && s.length() > 5)
                .findFirst()
                .or(() -> Optional.of("Default"));
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("Xylophone", "X-ray", "Apple", "Xenomorph");
        System.out.println("Результат: " + findFirstX(data).get());
    }
}