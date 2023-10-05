package Sesion8.ReglasOverriding;

public class ReglasOverriding {
    public static void main(String args[]){
        Person e = new Empleado();
        Empleado e2 = new Empleado();
        System.out.println(e.getValue());
        System.out.println(e.getEdad());

    }
}

class Empleado extends Person{
    protected String getValue() throws RuntimeException{
        return "hello";
    }
    private Object getName() throws Exception {
        return "Juan";
    }
    public static int getEdad(){
        return 20;
    }
}
class Person{
    protected Object getValue(){
        return "hello world";
    }
    private Object getName(){
        return "Juan";
    }
    protected static int getEdad(){
        return 30;
    }
}
