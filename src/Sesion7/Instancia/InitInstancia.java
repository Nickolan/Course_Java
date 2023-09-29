package Sesion7.Instancia;

public class InitInstancia {
    {
        System.out.println("hello ");
    }
    {
        System.out.println("world");
    }
    public static void main(String args[]){
        System.out.println("Hi, ");
        InitInstancia e1 = new InitInstancia();
        InitInstancia e2 = new InitInstancia();
    }

}
