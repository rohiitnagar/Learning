package UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderCalculator {

    public static void main(String[] args) throws IOException {

        // Declare the object of BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
        System.out.print("Please enter the first number: ");

        // Accept first number num1 here
        int num1 = Integer.parseInt(bf.readLine());

        System.out.print("Please enter the second number: ");

        // Accept first number num2 here
        int num2 = Integer.parseInt(bf.readLine());

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        // Accept Arithmetic operation choice here and perform the corresponding operation
        int choice = Integer.parseInt(bf.readLine());

        switch(choice){
            case 1 :
                System.out.println("Addition is" +add(num1,num2));
                break;
            case 2 :
                System.out.println("Subtraction is" +sub(num1,num2));
                break;
            case 3 :
                System.out.println("Multiplication is" +mul(num1,num2));
                break;
            case 4 :
                System.out.println("Div is" +div(num1,num2));
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }

    public static int add (int num1, int num2){
        return num1+num2;
    }

    public static int sub (int num1, int num2){
        return num1-num2;
    }

    public static int mul (int num1, int num2){
        return num1*num2;
    }

    public static int div (int num1, int num2){
        return num1/num2;
    }

}