package Operators;

class Animal {
}

class Dog extends Animal {
}

public class InstanceOfOperator {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Animal ref = new Dog(); // Upcasting (Dog as Animal)

        // Checking instances
        System.out.println("a instanceof Animal: " + (a instanceof Animal)); // true
        System.out.println("d instanceof Dog: " + (d instanceof Dog));       // true
        System.out.println("d instanceof Animal: " + (d instanceof Animal)); // true (Dog is a subclass of Animal)
        System.out.println("ref instanceof Dog: " + (ref instanceof Dog));   // true (ref is Dog type)
        System.out.println("ref instanceof Animal: " + (ref instanceof Animal)); // true
        System.out.println("a instanceof Dog: " + (a instanceof Dog));       // false (Animal is not a Dog)

        // instanceof with null
        Animal nullAnimal = null;
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false
    }
}
