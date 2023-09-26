package Sesion6.Student;

public class Student {
    private String name;
    private static int AGE_GROUP = 23;
    static{
        System.out.println("Cargando la clase");
    }
    {
        System.out.println("Inicializador instancia");
        name = "Juan Perez";
    }
    public static void main(String args[]){
        Student a = new Student();
        a.name = "Roberto Sanchez";
        a.printName("Sanchez Roberto");
        Student b = new Student();
        b.printName("Perez Juan");
    }
    public void printName(String name){
        System.out.println("Mi nombre es: " + this.name);
        System.out.println("-----");
        System.out.println(name);
    }
}
