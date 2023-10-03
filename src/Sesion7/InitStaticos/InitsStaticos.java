package Sesion7.InitStaticos;

public class InitsStaticos {
    public static int A;
    static {
        System.out.println("Hello ");
        B = 2;
    }
    static int B;
    static{
        System.out.println("World");
    }

    {
        System.out.println("Inicializar de instancia");
    }

    public InitsStaticos(){
        System.out.println("Constructor");
    }

    public static void main(String args[]){
        System.out.println("Clase cargada");
    }
}
