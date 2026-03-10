package task2;
import java.util.*;

public class UniqueStorage {

    public static Set<Object> getUnique(List<Object> list) {
        return new HashSet<>(list);
    }

    public static Map<Object, Integer> countOccurrences(List<Object> list) {
        Map<Object, Integer> counts = new HashMap<>();
        for (Object obj : list) {
            counts.put(obj, counts.getOrDefault(obj, 0) + 1);
        }
        return counts;
    }
}