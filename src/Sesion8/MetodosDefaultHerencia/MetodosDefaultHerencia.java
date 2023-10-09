package Sesion8.MetodosDefaultHerencia;

public class MetodosDefaultHerencia implements Interface1, Inteface2 {
    public static void main(String args[]){
        MetodosDefaultHerencia c = new MetodosDefaultHerencia();
        c.doIt();
        c.imprimir("prueba");
    }

    public void doIt() {
        System.out.println("interace 2");
    }

    public void imprimir(String message) {
        System.out.println(message);
    }
}

interface Interface1{
    void imprimir(String message);
    void doIt();
}

interface Inteface2{
    void imprimir(String message);
    public default void doIt(){
        System.out.println("interface 2");
    }
}