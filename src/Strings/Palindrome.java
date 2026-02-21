package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String copy = sc.next();
        //StringBuffer copy = str;
        StringBuffer s = new StringBuffer(copy);
        String reverse = s.reverse().toString();
        if(copy.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
            System.out.println(copy);
            System.out.println(reverse);
    }}
}
