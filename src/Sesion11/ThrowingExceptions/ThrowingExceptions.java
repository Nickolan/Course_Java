package Sesion11.ThrowingExceptions;

public class ThrowingExceptions  {


    public static void main(String args[]){
        try{
            //eatCarrot();
            good();
        } catch (NoMoreCarrotsException e){
            System.out.println("error");
        }

    }
    public static void good() throws NoMoreCarrotsException{
        eatCarrot();
    }

    private static void eatCarrot(){}
}
class NoMoreCarrotsException extends Exception{}
