package Collection.linkedlist;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(23);
        numbers.add(5);
        numbers.add(6);
        numbers.add(78);
        numbers.add(55);
        numbers.add(22);
        numbers.add(56);
        numbers.add(18);
        numbers.add(46);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());


    }
}
