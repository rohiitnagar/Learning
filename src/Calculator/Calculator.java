package Calculator;

import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int exit = 1;
        System.out.println("Welcome to Calculator");
        while(exit!=0){
            System.out.println("Enter num 1");
            double num1 = sc.nextInt();
            System.out.println("Enter num 2");
            double num2 = sc.nextInt();
            System.out.println("Select operation to perform\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n");

            int operation = sc.nextInt();

            Calculator c = new Calculator() ;
            switch(operation){
                case 1:
                    c.add(num1,num2);
                    break;
                case 2:
                    c.subtract(num1,num2);
                    break;
                case 3:
                    c.mutiply(num1,num2);
                    break;
                case 4:
                    c.divide(num1,num2);
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
            System.out.println("Enter 0 to exit or any number to continue");
            exit = sc.nextInt();
        }
    }

    public void add(double num1,double num2){
        System.out.println("Sum is"+ (num1+ num2));
    }


    public void subtract(double num1,double num2){
        System.out.println("Differnce is"+ (num1- num2));
    }


    public void mutiply(double num1,double num2){
        System.out.println("Multiplication is"+ (num1* num2));
    }


    public void divide(double num1,double num2){
        if(num2 == 0)
            System.out.println("Cannot divide by zero");
        else
            System.out.println("Division is"+ (num1/num2));
    }

}