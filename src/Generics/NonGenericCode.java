package Generics;

public class NonGenericCode {
    public static void main(String[] args) {
        Pair stringIntPair = new Pair("Hello", 23);
        String myString = (String) stringIntPair.getFirst();
        int myInt = (Integer)stringIntPair.getSecond();
    }
}
