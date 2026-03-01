package Inheritance;

public class AnimalUtility {
    public static void printName(Animal animal) {
        System.out.println(animal.getName());
    }

    public static void performAction(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.meow();
        }
    }
}
