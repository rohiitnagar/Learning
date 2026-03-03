package Exceptions;

import java.io.*;
import java.util.logging.Logger;

public class CheckedException {
    public static Logger logger = Logger.getLogger(CheckedException.class.getName());
    public static void main(String[] args) {
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(isr);
            String input = bf.readLine();
        }catch(IOException ex){
            logger.severe("Error");
        }
    }

    public void readFile(){
        try{
            FileReader fr = new FileReader("rohit");
        }catch(FileNotFoundException e){
            e.printStackTrace();
            logger.severe("Error");
        }

    }
}
