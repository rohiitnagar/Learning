package Exceptions;

public class ExceptionPropogation {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Method");
    }
    static  void method1(){
        try {
            method2();
        } catch (NullPointerException e) {
            System.out.println("Exception catched");
        }
    }
    static  void method2(){
        method3();
    }
    static  void method3(){
        method4();
    }
    static  void method4(){
        throw new NullPointerException("exception");
    }
}
