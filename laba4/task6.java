import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    List<Person> friends;
    Person(String n) { name = n; friends = new ArrayList<>(); }
}

public class task6 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan");
        Person p2 = new Person("Oleg");
        p1.friends.add(p2);
        p1.friends.add(new Person("Anna"));

        System.out.println("Результат: " + getUniqueFriends(Arrays.asList(p1)));
    }

    public static List<String> getUniqueFriends(List<Person> people) {
        return people.stream()
                .flatMap(p -> p.friends.stream())
                .map(f -> f.name.toUpperCase())
                .distinct()
                .collect(Collectors.toList());
    }
}