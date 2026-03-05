import java.util.Objects;

public class task5<K, V> {
    private K first;
    private V second;

    public task5(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public boolean compareTo(task5<K, V> other) {
        return Objects.equals(this.first, other.first) &&
               Objects.equals(this.second, other.second);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {

        task5<Integer, String> p1 = new task5<>(1, "Mango");
        task5<Integer, String> p2 = new task5<>(1, "Mango");
        task5<Integer, String> p3 = new task5<>(2, "Banana");

        System.out.println("Pair 1: " + p1);
        System.out.println("Pair 2: " + p2);
        System.out.println("Pair 3: " + p3);

        System.out.println("p1 equals p2: " + p1.compareTo(p2));
        System.out.println("p1 equals p3: " + p1.compareTo(p3));
    }
}