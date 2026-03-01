package Inheritance;

public class Person {

    protected  String name;
    protected  int age;
    public static int noOfHands =2;
    private void calculateAge(int year){
        System.out.println("age");
    }
    public void eat(String food){
        System.out.println("Person is eating: "+ food);
    }

    public void walk(){
        System.out.println("Person is walking");
    }

    public void sleep(){
        System.out.println("Person is sleeping ");
    }
}
