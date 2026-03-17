import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Результат: " + multiplyOdds(numbers).get());
    }

    public static Optional<Integer> multiplyOdds(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 != 0)
                .reduce((a, b) -> a * b);
    }
}