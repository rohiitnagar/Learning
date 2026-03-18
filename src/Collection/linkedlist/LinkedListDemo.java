package Collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList= new LinkedList<>();
        List<Double> doubleList= new LinkedList<>();
        var charList = new LinkedList<Character>();
        List<String> country = new LinkedList<>();
        country.add("India");
        country.add("Canada");
        country.add("France");
        country.add("Germany");
        country.add("France");
        System.out.println(country);
        country.remove("Germany");
        country.set(3,"Italy");
        System.out.println(country);
    }
}
