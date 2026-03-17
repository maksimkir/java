import java.util.*;

class Product {
    String name;
    double price;
    Product(String n, double p) { name = n; price = p; }
}

public class task8 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 500), new Product("Laptop", 1200), new Product("Tablet", 800)
        );
        System.out.println("Результат: " + findSecondExpensive(products).get());
    }

    public static Optional<String> findSecondExpensive(List<Product> list) {
        return list.stream()
                .sorted(Comparator.comparingDouble((Product p) -> p.price).reversed())
                .skip(1)
                .map(p -> p.name)
                .findFirst();
    }
}