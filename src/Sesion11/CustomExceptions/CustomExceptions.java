package Sesion11.CustomExceptions;

import java.io.FileNotFoundException;

public class CustomExceptions extends Exception {
    public CustomExceptions(){
        super();
    }
    public CustomExceptions(Exception e){
        super(e);
    }
    public CustomExceptions(String message){
        super(message);
    }
    public static void main(String args[]) throws Exception{
        throw new CustomExceptions(new FileNotFoundException("archivo perdido"));
    }
}
