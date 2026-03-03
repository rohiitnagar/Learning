package Exceptions;

public class InValidAgeException extends Exception{

    public InValidAgeException(){
        super();
    }

    public InValidAgeException(String message){
        super(message);
    }
}
