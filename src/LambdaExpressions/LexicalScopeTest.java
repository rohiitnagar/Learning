package LambdaExpressions;

public class LexicalScopeTest {

    public static void main(String[] args) {
        String input = "Hello World";
        Printer printer = input1 -> System.out.println(input1);
        printer.print("Hello");
    }
}
