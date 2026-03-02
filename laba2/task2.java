import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class task2 {
    private Queue<String> orders = new LinkedList<>();

    // Метод для додавання замовлення
    public void addOrder(String orderName) {
        orders.add(orderName);
        System.out.println("zamovlenia dodano: " + orderName);
    }

    // Метод для обробки (видалення) першого замовлення
    public void processOrder() {
        try {
            // remove() повертає голову черги або кидає NoSuchElementException, якщо порожньо
            String removedOrder = orders.remove();
            System.out.println("obrobлено zamovlennya: " + removedOrder);
        } catch (NoSuchElementException e) {
            System.err.println("Pomilka: Nemozhlyvo obrobiti zamovlennya. Cherha porozhnya!");
        }
    }

    public static void main(String[] args) {
        task2 manager = new task2();

        // 1. Dodaemo zamovlennya
        manager.addOrder("zamovlennya #1 (Pitsa)");
        manager.addOrder("zamovlennya #2 (Sushi)");

        // 2. Обробляємо замовлення
        manager.processOrder(); // Обробить #1
        manager.processOrder(); // Обробить #2

        // 3. Спроба обробити з порожньої черги (викличе Exception)
        manager.processOrder();
    }
}