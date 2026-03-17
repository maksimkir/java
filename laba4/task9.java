import java.util.*;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {
        Map<Integer, Optional<String>> map = new HashMap<>();
        map.put(1, Optional.of("bread"));
        map.put(2, Optional.empty());
        map.put(3, Optional.of("milk"));
        System.out.println("Результат: " + getNames(map));
    }

    public static List<String> getNames(Map<Integer, Optional<String>> map) {
        return map.values().stream()
                .flatMap(Optional::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}