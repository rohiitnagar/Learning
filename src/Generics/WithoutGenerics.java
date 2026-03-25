package Generics;

import java.util.ArrayList;

public class WithoutGenerics {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);

        String greeting = (String) list.get(0);
        int number = (Integer)list.get(1);
        boolean flag = (Boolean) list.get(2);
    }
}
