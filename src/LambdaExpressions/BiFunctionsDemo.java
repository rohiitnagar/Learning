package LambdaExpressions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionsDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (num1, num2)-> (num1+num2)%2==0;
        System.out.println(isSumEven.test(5,10));

        BiFunction<Double, Double, Double> getPower = (num1,num2) -> Math.pow(num1,num2);
        System.out.println(getPower.apply(2.0,3.0));

        BiFunction<Integer, Integer, Double> getPowerInt = (num1,num2) -> Math.pow(num1,num2);
        System.out.println(getPowerInt.apply(2,3));

        BiConsumer<String, String> append = (input1, input2) ->
                System.out.println(input1.toLowerCase()+ input2.toUpperCase());

        append.accept("Rohit", "Nagar");

        BiConsumer<String, String> appendAndLength = (input1, input2) ->
                System.out.println((input1+ input2).length());

        appendAndLength.accept("Rohit", "Nagar");

        BinaryOperator<Double> getPowerBi = (num1,num2) -> Math.pow(num1,num2);
        System.out.println(getPowerBi.apply(2.0,3.0));

       BinaryOperator<Integer> maxOperation =
               BinaryOperator.maxBy((a,b) -> Integer.compare(a,b));
        System.out.println(maxOperation.apply(5,10));

    }
}
