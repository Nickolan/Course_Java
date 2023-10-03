package Sesion7.Finales;

public class Finales {
    public static final int A = 10;
    //public static final int C;
    static {
        B = 20;
    }
    static{
        System.out.println(A);
        //System.out.println(B);
        //B = 10;
    }
    public static final int B;
    public static void main(String args[]){
        System.out.println("Cargando Clase");
        final int suma;
        suma = 100;
        System.out.println(suma);
    }
}
