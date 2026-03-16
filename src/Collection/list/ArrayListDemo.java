package Collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    //Cool Verison of array
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<String> countryNames = new ArrayList<String>();
        List<Character> chars = new java.util.ArrayList<Character>();
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.add(2,"Coutnry a 2");
        System.out.println(countryNames);
        countryNames.set(2, "France");
        System.out.println(countryNames);
        countryNames.remove("India");
        System.out.println(countryNames);
        countryNames.get(2);
        System.out.println(countryNames.get(2));

    }
}
