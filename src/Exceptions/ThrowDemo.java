package Exceptions;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1");
        String num1 = scanner.next();
        System.out.println("Num2");
        String num2 = scanner.next();
        Division division = new Division();

        if(num2.equals("0")){
            throw  new ArithmeticException("Zero not allowed");
        }
        double output = division.divide(num1, num2);
        System.out.println(output);
    }
}
