package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(7);
        hashSet1.add(4);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet1.add(8);
        hashSet1.add(12);

        //Union
        //hashSet1.addAll(hashSet2);
        System.out.println(hashSet1);

        //Intersection
        //hashSet1.retainAll(hashSet2);
        //System.out.println(hashSet1);

    }
}
//