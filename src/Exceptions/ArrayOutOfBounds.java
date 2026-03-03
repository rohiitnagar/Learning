package Exceptions;

import java.util.logging.Logger;

public class ArrayOutOfBounds {

    private static Logger logger = Logger.getLogger(ArrayOutOfBounds.class.getName());
    public static void main(String[] args) {
       try{
           int[] array = {1,2,3,4,5};
           System.out.println(array[5]);
       }catch(ArrayIndexOutOfBoundsException e){
           logger.severe("Invalid Array Index");
           System.out.println(e.getStackTrace());
       }
    }
}
