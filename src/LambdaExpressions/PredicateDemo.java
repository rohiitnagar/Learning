package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num%2 ==0 ;
        isEven.test(16);
        System.out.println(isEven.test(16));

        Predicate<Integer> isGreaterThan50 = num -> num>50;
        System.out.println(isGreaterThan50.test(51));

        System.out.println(isEven.and(isGreaterThan50).test(60));

        isEven.or(isGreaterThan50).test(22);

        isEven.negate().test(21);

        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(isOdd.test(5));

        Predicate<String> checkEquality = Predicate.isEqual("Rohit");

        //Real Scenario
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());

        System.out.println(evenList);
        List<Integer> evenList2 = list.stream().filter(num-> num%2==0).collect(Collectors.toList());
        System.out.println(evenList2);
    }
}
