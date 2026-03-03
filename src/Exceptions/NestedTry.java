package Exceptions;

public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                try{

                } catch (Exception e) {

                }
            } catch (Exception e) {

            }
        }catch(Exception e){

        }
    }
}
