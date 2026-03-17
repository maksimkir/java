import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    double amount;
    String category;
    Transaction(double a, String c) { amount = a; category = c; }
}

public class task7 {
    public static void main(String[] args) {
        List<Transaction> list = Arrays.asList(
            new Transaction(100, "Food"), new Transaction(200, "Tech"), new Transaction(50, "Food")
        );
        System.out.println("Результат: " + summarize(list));
    }

    public static Map<String, Double> summarize(List<Transaction> list) {
        return list.stream()
                .collect(Collectors.groupingBy(t -> t.category, Collectors.summingDouble(t -> t.amount)));
    }
}