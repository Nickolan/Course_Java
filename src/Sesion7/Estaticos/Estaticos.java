package Sesion7.Estaticos;

public class Estaticos {
    private String nombre;

    public int suma(){
        return 3;
    }
    public static int suma(int a){
        return 3 + a;
    }
    public static void main(String args[]){
        // no compila

        //acceso a variables de instancia
        //this.nombre = "Juan Perez";
        //nombre = "Juan Perez";

        // acceso a metodos de instancia
        //suma();

        // acceso a metodos estaticos
        System.out.println(suma(3));
        // si compila
        Estaticos e = new Estaticos();
        e.nombre = "Juan Perez";
    }
}
