public class task3<T> {
    private T item;

    public void put(T item) { this.item = item; }
    public T get() { return item; }

    public static void main(String[] args) {
        task3<Integer> intBox = new task3<>();
        intBox.put(123);
        
        task3<String> strBox = new task3<>();
        strBox.put("Привіт, Generics!");
        
        System.out.println("Box 1: " + intBox.get());
        System.out.println("Box 2: " + strBox.get());
    }
}