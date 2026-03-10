import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Labrador extends Dog {
    @Override
    void makeSound() {
        System.out.println("Labrador says: Woof Woof!");
    }
}

class AnimalShelter {

    private List<Dog> dogs = new ArrayList<>();
    private List<Animal> otherAnimals = new ArrayList<>();

    public void addAnimals(List<? extends Dog> dogList) {
        dogs.addAll(dogList);
    }

    public void addOtherAnimal(Animal animal) {
        otherAnimals.add(animal);
    }

    public void printAnimalSounds() {

        System.out.println("Dogs:");
        for (Dog d : dogs) {
            d.makeSound();
        }

        System.out.println("Other animals:");
        for (Animal a : otherAnimals) {
            a.makeSound();
        }
    }
}

public class task8 {

    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Labrador labrador = new Labrador();

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);
        dogList.add(labrador);

        shelter.addAnimals(dogList);
        shelter.addOtherAnimal(cat);

        shelter.printAnimalSounds();
    }
}