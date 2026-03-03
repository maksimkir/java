import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class task2 {
    private Queue<String> orders = new LinkedList<>();

    // додавання замовлення
    public void addOrder(String orderName) {
        orders.add(orderName);
        System.out.println("zamovlenia dodano: " + orderName);
    }

    // видалення першого замовлення
    public void processOrder() {
        try {
            String removedOrder = orders.remove();
            System.out.println("obrobлено zamovlennya: " + removedOrder);
        } catch (NoSuchElementException e) {
            System.err.println("Pomilka: Nemozhlyvo obrobiti zamovlennya. Cherha porozhnya!");
        }
    }

    public static void main(String[] args) {
        task2 manager = new task2();

        // +
        manager.addOrder("zamovlennya #1 (Pitsa)");
        manager.addOrder("zamovlennya #2 (Sushi)");

        //  Обробляємо
        manager.processOrder();
        manager.processOrder(); 

        // порожньої черги 
        manager.processOrder();
    }
}