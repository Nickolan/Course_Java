package Sesion8.Implementacion;

public class Implementacion extends Herencia implements  Movable, Readable {
    public void read(){
        System.out.println("Implementando read");
    }

    public static void main(String args[]){
        Implementacion o = new Implementacion();
        Movable m = new Implementacion();
        Movable.move();
        System.out.println(o.nombre);
        o.saludo();
        o.read();
        //o.move();
    }
}
interface Movable{
    String nombre = "Movable";
    static void move(){}
}

interface Readable{
    void read();
    default void saludo(){
        System.out.println("hi");
    }
}

class Herencia{}


