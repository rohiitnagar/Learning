package Collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorLinkedList {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();
        country.add("India");
        country.add("Canada");
        country.add("France");
        country.add("Germany");
        country.add("France");

        for (String name: country){
            System.out.println(name.toUpperCase());
        }

        Iterator<String> iterator = country.iterator();

        while(iterator.hasNext()){
            String countryName = iterator.next();
            System.out.println(countryName);
        }
    }
}
