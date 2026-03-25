package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("USA","Washington DC");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);

        System.out.println(countryMap.get("India"));
        countryMap.remove(null);
        System.out.println(countryMap.size());

        //How it store data - >
        /*
        buckets are created
        Hashing principle
        - Calculate Hashcode
        - Null - invalid - index = 0

         */
    }

}
