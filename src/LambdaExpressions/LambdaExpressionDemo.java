package LambdaExpressions;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello");
        procss(hello);

        ArithmeticOperations add = (a,b) -> a+b;
        System.out.println(add.operation(5,5));

        ArithmeticOperations sub = (int a, int b) -> a-b;
        System.out.println(sub.operation(10,5));

    }

    public  static void procss(Hello h){
        h.sayHello();
    }
}
