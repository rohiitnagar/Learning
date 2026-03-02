package UserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Enter a value");
        String input = bf.readLine();
        System.out.println("Entered value is: "+ input);
        bf.close(); //Don't forget to close
    }
}
