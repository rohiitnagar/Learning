package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> convertStr = (input) -> input.toUpperCase();
        System.out.println(convertStr.apply("Rohit"));

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> even = list.stream().filter(num1-> num1%2==0).collect(Collectors.toList());
//        System.out.println(even);

        Function<String, String> covertedtoLowerCase = ((input) -> input.toLowerCase());
        System.out.println(covertedtoLowerCase.apply("ROHIT"));

        Function<String, Integer> getLengthofString = ((input) -> input.length());
        System.out.println(getLengthofString.apply("ROHIT"));

        Function<String, String> sameValue= Function.identity();
        System.out.println(sameValue.apply("Rohit"));

        Function<Integer, Integer> doubleValue = num -> num*2;
        Function<Integer, Integer> addThree = num -> num+3;

        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);

        System.out.println(output1.apply(5)); // first Double then add three
        System.out.println(output2.apply(5)); //First add three then double
    }
}
