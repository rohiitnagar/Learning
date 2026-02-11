package section4;

public class ArithmeticOperations {
    public static void main(String[] args) {
    ArithmeticOperations a = new ArithmeticOperations();
        int sum  = a.sum(2,3);
        System.out.println(sum);
    }

    public int sum(int num1, int num2){
        return num1+num2;
    }

    public int subtract(int num1, int num2){
        return num1-num2;
    }
}
