package UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSum {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Enter number 1 ");
        String number1 = bf.readLine();
        int num1 = Integer.parseInt(number1);
        System.out.println("Enter number 2");
        String number2 = bf.readLine();
        int num2 = Integer.parseInt(number2);
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: "+ sum);
    }
}
