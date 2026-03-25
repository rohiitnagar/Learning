package Collection.Set;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("France");
        visitedCountries.add("USA");
        visitedCountries.add("Canada");
        visitedCountries.add("India");

        System.out.println(visitedCountries);
        System.out.println(visitedCountries.size());

        boolean isDubai = visitedCountries.contains("Dubai");
        System.out.println(isDubai);
    }
}
