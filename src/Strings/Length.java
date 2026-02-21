package Strings;

public class Length {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = str1+str2;
        System.out.println(str3);

        String str4 = str1+" "+ str2;
        System.out.println(str4);

        System.out.println(str4.length());
        System.out.println(str3.length());

        int length = "Hello".length();
        System.out.println(length);
    }



}
