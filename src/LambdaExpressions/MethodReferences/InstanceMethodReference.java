package LambdaExpressions.MethodReferences;

public class InstanceMethodReference {
    public static void main(String[] args) {
        ArithmeticExpressions operation = (a,b) -> {
            int sum = a+b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2,3);

        //USing method references gerefd
        InstanceMethodReference instanceMethodReferences = new InstanceMethodReference();
        ArithmeticExpressions methodReference = instanceMethodReferences::performAddition;
        methodReference.performOperation(2,3);
    }

    public int performAddition(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}

