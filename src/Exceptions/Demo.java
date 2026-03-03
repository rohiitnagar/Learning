package Exceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
             sc = new Scanner(System.in);
            System.out.println("Enter number");
            int num = sc.nextInt();
            System.out.println("Entered number is:"+num);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }finally {
            if(sc!=null){
                sc.close();
            }
        }

        System.out.println("Some piece of code");
    }
}
