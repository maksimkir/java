package task8;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Dog> dogs = new ArrayList<>();
    private List<Animal> others = new ArrayList<>();

    public void addAnimals(List<? extends Dog> list) {
        dogs.addAll(list);
    }

    public void addOther(Animal animal) {
        others.add(animal);
    }

    public void printAnimalSounds() {
        System.out.println("Dogs:");
        for (Dog d : dogs) {
            d.makeSound();
        }
        System.out.println("Others:");
        for (Animal a : others) {
            a.makeSound();
        }
    }
}