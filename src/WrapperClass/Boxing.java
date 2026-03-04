package WrapperClass;

public class Boxing {
    public static void main(String[] args) {
        int num = 16;

        //Approach1 usiing COntructor (Deprecated)
        Integer integer = new Integer(num);
        Double doubleObj = new Double(3.15);
        Long longObj = new Long("12346");

        //Approach2 usiing valueOf - recommended approach
        Integer integer1 = Integer.valueOf(num);
        Double doubleObj1 = Double.valueOf("3.14");
        Long longObj1 = Long.valueOf(45665);

        //Parsing - Demo

        int num7 = Integer.parseInt("123");
        double num2 = Double.parseDouble("3.14");
        long num3 = Long.parseLong("5165165");
    }
}
