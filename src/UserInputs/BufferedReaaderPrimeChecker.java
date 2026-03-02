package UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaaderPrimeChecker {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Enter number ");
        String number = bf.readLine();
        int num = Integer.parseInt(number);
        /*
        Prime number: Divisble by self or 1
         */
        if(isPrime(num)){
            System.out.println("Number is prime");
        } else System.out.println("Number is not prime");

    }

    private static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2; i <=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
