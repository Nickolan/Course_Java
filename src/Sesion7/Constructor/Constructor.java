package Sesion7.Constructor;

public class Constructor {
    {
        System.out.println("Inicializador 1");
    }
    {
        System.out.println("Inicializador 2");
    }
    public Constructor(){
        this("clase");
        System.out.println("Constructor");
    }
    public Constructor(String str){
        System.out.println("constructor: " + str);
    }
    public static void main(String args[]){
        Constructor c = new Constructor();
    }
}
