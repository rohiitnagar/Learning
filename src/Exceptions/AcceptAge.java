package Exceptions;

import java.util.Scanner;

public class AcceptAge {
    public static void main(String[] args) throws InValidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter age");
        int age = scanner.nextInt();
        if(age<0 || age>100){
            throw new InValidAgeException("Invalid age");
        }
        System.out.println("Your age is: "+ age);
    }
}
