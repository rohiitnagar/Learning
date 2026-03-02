package UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEvenOdd {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Enter a value");
        String input = bf.readLine();
        int num = Integer.parseInt(input);
        if(num%2==0){
            System.out.println("Entered is even");
        }else {
            System.out.println("Entered is Odd");
        }

        bf.close(); //Don't forget to close
    }
}
