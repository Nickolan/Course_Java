package Sesion10.TryCatchExample.ChainingCatchs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChainingCatchs {
    public static void main(String args[]) throws Exception{
        try {
            throwException();
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e){
            System.out.println("IoException");
        }
    }

    public static void throwException() throws Exception{
        throw new FileNotFoundException();
    }
}
