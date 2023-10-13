package Sesion11.PrintingExceptions;

public class PrintingExceptions {
    public static void main(String args[]) throws Exception{
        try{
            lanzandoException();
        }catch (Exception e){
            throw e;
        }
    }
    public static void lanzandoException(){
        throw new RuntimeException("mensaje de la exception");
    }
}


