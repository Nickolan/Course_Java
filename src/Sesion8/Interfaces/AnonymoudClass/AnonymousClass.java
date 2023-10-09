package Sesion8.Interfaces.AnonymoudClass;

public class AnonymousClass {
    public static void main(String args[]){
        Dummy d = new Dummy(){
            public void imprimir(){
                System.out.println("hello");
            }
        };
        d.imprimir();
    }
}

interface Dummy{
    void imprimir();
}
