package Sesion10.TryWithResources;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String args[]){
        // Estructura try/catch
        try{

        }catch (Exception e){

        }

        // Estructura try-with-resources
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // manejo del archivo
        }catch (IOException e){
            System.out.println("Error de archivo");
        }finally {
            System.out.println("Fin del bloque");
        }
    }
}
