package Strings;

public class Searching {
    public static void main(String[] args) {
        String str = "Hello, World!";

        int index = str.indexOf("World");
        int index1 = str.indexOf("!");

        boolean isContains = str.contains("World");
        boolean isPresent= str.contains("@");

        boolean startWith = str.startsWith("Hello");
        boolean endsWith = str.endsWith("ld!");

        boolean isMatched = str.matches("World!");
    }
}
