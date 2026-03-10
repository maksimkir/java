package task3;
public class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
        System.out.println("Put in box: " + item);
    }

    public T get() {
        System.out.println("Got from box: " + item);
        return item;
    }
}