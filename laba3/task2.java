import java.util.*;

public class task2 {

    public static <T> Set<T> getUnique(List<T> list) {
        return new HashSet<>(list);
    }

    public static <T> Map<T, Integer> countOccurrences(List<T> list) {
        Map<T, Integer> counts = new HashMap<>();
        for (T item : list) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {

        List<String> data = Arrays.asList(
         "apple", "banana", "apple",
                "orange", "banana", "apple"
        );

        System.out.println("Original list: " + data);
        System.out.println("Unique elements: " + getUnique(data));
        System.out.println("Occurrences: " + countOccurrences(data));
    }
}