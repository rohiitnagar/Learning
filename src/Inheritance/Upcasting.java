package Inheritance;

public class Upcasting {
    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Scooby");
        System.out.println(anm.getName());
        anm.eat();

        anm = new Dog();
        anm.setName("Charlieeeeeeeeeeeeee");
        System.out.println(anm.getName());
        anm.eat();

        Cat cat = new Cat();
        cat.setName("cat");
        AnimalUtility.printName(cat);
    }
}
