package Sesion8.SuperParaMiebros;

public class SuperParaMiebros {
    public static void main(String args[]){
        Empleado emp = new Empleado();
        emp.invocar();
        //emp.imprimirDatos();
    }
}

class Empleado extends Person{
    public String name = "Empleado";
    public void invocar(){
        //this.imprimirDatos();
        //super.imprimirDatos();
    }
    protected void imprimirDatos(){
        System.out.println("Impresion segun clase Empleado");
        System.out.println(name);
        super.imprimirDatos();
        System.out.println(super.name);
    }
}

class Person extends Humano{
    public String name = "Person";
    protected void imprimirDatos(){
        System.out.println("Impresion segun clase Person");
        //super.imprimirDatos();
    }
}
class Humano{
    protected void imprimirDatos(){
        System.out.println("Impresion segun clase Humano");
    }
}
