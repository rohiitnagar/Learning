package Exceptions;

import java.util.Scanner;

public class TryWithResouces {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter number");
            int num = sc.nextInt();
            System.out.println("Entered number is:"+num);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
}
