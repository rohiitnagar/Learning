package Collection.Map;

import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of();
        processMap(stringIntegerMap);
    }

    public static void processMap(Map<String, Integer> stringIntegerMap){
        for(Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
