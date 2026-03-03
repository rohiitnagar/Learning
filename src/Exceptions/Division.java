package Exceptions;

import java.io.IOException;

public class Division {

    public double divide(String num1, String num2) throws NumberFormatException, ArithmeticException {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = n1/n2;
        return result;
    }
}
