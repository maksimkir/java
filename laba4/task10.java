import java.util.*;

public class task10 {
    public static void main(String[] args) {
        Map<String, List<Integer>> temps = new HashMap<>();
        temps.put("Kyiv", Arrays.asList(10, 15, 20));
        temps.put("Lviv", Arrays.asList(12, 14, 16));
        System.out.println("Результат: " + findHottestCity(temps));
    }

    public static String findHottestCity(Map<String, List<Integer>> map) {
        return map.entrySet().stream()
                .max(Comparator.comparingDouble(e -> e.getValue().stream().mapToInt(i -> i).average().orElse(0)))
                .map(Map.Entry::getKey)
                .orElse("None");
    }
}