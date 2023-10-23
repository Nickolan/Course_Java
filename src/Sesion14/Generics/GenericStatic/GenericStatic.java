package Sesion14.Generics.GenericStatic;

public class GenericStatic<T> {
    private T contenido;
    public <U> void sink1(U t){
        System.out.println(t);
    }
    public static <U> void sink(U t){
        System.out.println(t);
    }
    public static <T> T identity(T t){
        return t;
    }

    public static void main(String args[]){
        GenericStatic<Elefante> gen = new GenericStatic<>();
        Elefante el = gen.contenido;
        Elefante e2 = new Elefante();
        gen.sink1(e2);
        GenericStatic.sink("nombre");
        GenericStatic.<String>sink("nombre");
    }
}

class Elefante{}
