package Collection.Set;

import java.util.TreeSet;

public class TreesSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Germany");
        System.out.println(treeSet);
        treeSet.remove("Germany");
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.contains("India"));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
