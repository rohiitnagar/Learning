package Exceptions;

import javax.swing.*;

public class ThrowsDemo {

    public static void main(String[] args) {
        Division division = new Division();
        try{
            double output = division.divide("4","0");
            System.out.println(output);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Enter correct num");
        }
    }
}
