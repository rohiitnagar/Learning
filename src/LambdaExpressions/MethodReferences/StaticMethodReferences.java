package LambdaExpressions.MethodReferences;

public class StaticMethodReferences {
    public static void main(String[] args) {
        ArithmeticExpressions operation = (a,b) -> {
            int sum = a+b;
            System.out.println(sum);
            return sum;
        };
    operation.performOperation(2,3);

    //USing method references
    ArithmeticExpressions methodReference = StaticMethodReferences ::performAddition;
    methodReference.performOperation(2,3);
    }

    public static int performAddition(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}
