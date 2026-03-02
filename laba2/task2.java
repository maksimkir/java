import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class task2 {
    private Queue<String> orders = new LinkedList<>();

    // Метод для додавання замовлення
    public void addOrder(String orderName) {
        orders.add(orderName);
        System.out.println("Замовлення додано: " + orderName);
    }

    // Метод для обробки (видалення) першого замовлення
    public void processOrder() {
        try {
            // remove() повертає голову черги або кидає NoSuchElementException, якщо порожньо
            String removedOrder = orders.remove();
            System.out.println("Оброблено замовлення: " + removedOrder);
        } catch (NoSuchElementException e) {
            System.err.println("Помилка: Неможливо обробити замовлення. Черга порожня!");
        }
    }

    public static void main(String[] args) {
        task2 manager = new task2();

        // 1. Додаємо замовлення
        manager.addOrder("Замовлення #1 (Піца)");
        manager.addOrder("Замовлення #2 (Суші)");

        // 2. Обробляємо замовлення
        manager.processOrder(); // Обробить #1
        manager.processOrder(); // Обробить #2

        // 3. Спроба обробити з порожньої черги (викличе Exception)
        manager.processOrder();
    }
}