package Exceptions;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Enter numerator");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter deno");
        int den = sc.nextInt();
        if(den==0){
            throw new DivideByZeroException("Caannot divicde by zrero");
        }
    }
}
