package WrapperClass;

public class Unboxing {
    public static void main(String[] args) {
        int num =16;
        //Boxinng
        Integer integer1 = Integer.valueOf(num);
        Double doubleObj1 = Double.valueOf("3.14");
        Long longObj1 = Long.valueOf(45665);

        //Unboxing
        int num1 = integer1.intValue();
        double num2 = doubleObj1.doubleValue();
        long num3 = longObj1.longValue();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

}
