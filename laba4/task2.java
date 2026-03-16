import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collectors;

public class task2 {
    public static List<Integer> unwrapOptionals(List<Optional<Integer>> optionals) {
        return optionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Optional<Integer>> data = Arrays.asList(
            Optional.of(10), Optional.empty(), Optional.of(25)
        );
        System.out.println("Результат: " + unwrapOptionals(data));
    }
}