package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new LinkedHashMap<>();
        treeMap.put(23, "Twenty three");
        treeMap.put(3, " three");
        treeMap.put(2, "two");
        treeMap.put(51, "Fifty one");
        treeMap.put(12, " twelve");
        treeMap.put(87, "Eighty seven ");
        treeMap.put(8, " Eight");

        for(Map.Entry<Integer, String> number : treeMap.entrySet()){
            System.out.println(number.getKey()+ number.getValue());
        }

    }
}
