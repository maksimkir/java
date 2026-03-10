import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import task1.Student;
import task1.StudentRegistry;
import task2.UniqueStorage;
import task3.Box;
import task4.MaxFinder;
import task5.Pair;
import task6.Circle;
import task6.Rectangle;
import task6.Shape;
import task6.ShapeUtils;
import task7.ListUtils;
import task8.AnimalShelter;
import task8.Cat;
import task8.Dog;
import task8.Labrador;

public class Main {
    public static void main(String[] args) {

        // --- Task 1: Student Registry ---
        System.out.println("=== Task 1: Student Registry ===");
        StudentRegistry reg = new StudentRegistry();
        reg.addStudent(new Student(1, "Alice", 95.0));
        reg.addStudent(new Student(2, "Bob", 87.5));
        reg.addStudent(new Student(3, "Charlie", 76.0));
        System.out.println("\nAll students:");
        reg.printAll();
        System.out.println("\nFind id=2: " + reg.findStudent(2));
        reg.removeStudent(1);
        System.out.println("\nAfter removal:");
        reg.printAll();


        // --- Task 2: Unique Storage ---
        System.out.println("\n=== Task 2: Unique Storage ===");
        List<Object> items = new ArrayList<>(Arrays.asList("java", "js", "java", "vanya", "js", "lab3"));
        
        System.out.println("Original: " + items);
        System.out.println("Unique: " + UniqueStorage.getUnique(items));
        System.out.println("Occurrences: " + UniqueStorage.countOccurrences(items));

        // --- Task 3: Generic Box ---
        System.out.println("\n=== Task 3: Generic Box ===");
        Box<Integer> intBox = new Box<>();
        intBox.put(42);
        intBox.get();
        
        Box<String> strBox = new Box<>();
        strBox.put("Hello");
        strBox.get();

        // --- Task 4: Generic findMax ---
        System.out.println("\n=== Task 4: findMax ===");
        Integer[] ints = {3, 7, 1, 9, 4};
        Double[] doubles = {1.5, 3.2, 2.8};
        Character[] chars = {'a', 'z', 'm'};
        String[] strings = {"banana", "apple", "orange"};
        
        System.out.println("Max Integer: " + MaxFinder.findMax(ints));
        System.out.println("Max Double: " + MaxFinder.findMax(doubles));
        System.out.println("Max Character: " + MaxFinder.findMax(chars));
        System.out.println("Max String: " + MaxFinder.findMax(strings));

        // --- Task 5: Generic Pair ---
        System.out.println("\n=== Task 5: Pair ===");
        Pair<Integer, String> p1 = new Pair<>(1, "hello");
        Pair<Integer, String> p2 = new Pair<>(1, "hello");
        Pair<Integer, String> p3 = new Pair<>(2, "world");
        
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        // --- Task 6: Upper-bounded wildcard ---
        System.out.println("\n=== Task 6: Shapes ===");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Circle(3));
        
        System.out.println("Total area: " + ShapeUtils.calculateTotalArea(shapes));


        // --- Task 7: Lower-bounded wildcard ---
        System.out.println("\n=== Task 7: Lower-bounded wildcard ===");
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        
        ListUtils.addNumbers(intList);
        ListUtils.addNumbers(numList);
        
        System.out.println("Integer list: " + intList);
        System.out.println("Number list: " + numList);

        // --- Task 8: Animal Shelter ---
        System.out.println("\n=== Task 8: Animal Shelter ===");
        AnimalShelter shelter = new AnimalShelter();
        
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Labrador());
        
        shelter.addAnimals(dogList);
        shelter.addOther(new Cat());
        
        shelter.printAnimalSounds();

    }
}