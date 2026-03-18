package Generics;

public class GenricCode {
    public static void main(String[] args) {
        GenericPair<String, Integer> intStringPair = new GenericPair<>("Hello", 23);
        String myString = intStringPair.getFirst();
        int myInt = intStringPair.getSecond();
    }

}
