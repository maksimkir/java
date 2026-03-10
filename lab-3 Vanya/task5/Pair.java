package task5;
import java.util.Objects;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() { return first; }
    public B getSecond() { return second; }

    public boolean equals(Pair<A, B> other) {
        return Objects.equals(this.first, other.first) &&
               Objects.equals(this.second, other.second);
    }

    @Override
    public String toString() {
        return "Pair(" + first + ", " + second + ")";
    }
}