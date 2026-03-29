package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("rohit");

        Consumer<Integer> squareOf = num -> System.out.println(num*num);
        squareOf.accept(5);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.forEach(squareOf);

        Consumer<String> appendString = input -> System.out.println("Hello" + input);
        appendString.accept("Rohit");

        appendString.andThen(convertAndDisplay).accept("Some");
        convertAndDisplay.andThen(appendString).accept("upp");

//        UnaryOperator<String> toUpppercase = input -> input.toUpperCase();
//        appendString.accept(toUpppercase.apply("Rohit"));
//
//        UnaryOperator<String> appendStringUnary = input -> "Hello" + input;
//        appendStringUnary.apply("Rohit");
//        convertAndDisplay.accept(appendStringUnary.apply("rohit"));

    }
}
