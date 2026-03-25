package Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("India");
        linkedHashSet.add("USA");
        linkedHashSet.add("Dubaai");
        linkedHashSet.add("frnace");

        for(String country : linkedHashSet){
            System.out.println(country);
        }
    }
}
