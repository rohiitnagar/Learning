package Inheritance;

public class DownCasting {
    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog; //Upcasting

        dog  = (Dog)anm; //Downcasting

        AnimalUtility.performAction(dog);
        //Cat cat = (Cat)anm;
    }
}
