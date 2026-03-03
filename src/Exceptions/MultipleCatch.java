package Exceptions;

import java.util.logging.Logger;

public class MultipleCatch {

    private static Logger logger = Logger.getLogger(MultipleCatch.class.getName());
    public static void main(String[] args) {
        String input = null;
        try{
            input = "Rohit";
            input = input.toUpperCase();
            input = input.substring(1,10);
        } catch (NullPointerException ex) {
            logger.severe("Null pointer");
        }catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex){
            logger.severe("String error"); //Multiple exception
        }catch (Exception ex){
            logger.severe("Some errror");
        }
    }
}
