package Sesion7.InitHaciaAdelante;

import java.sql.SQLOutput;

public class InitHaciaAdelante {
    private int MAX = 3;
    private int i = 10;
    private int j = 20;
    {
        System.out.println("hello ");
    }
    {
        System.out.println(i);
        i = 20;
        imprimir();
        MAX = 5;
    }
    public static void main(String args[]){
        InitHaciaAdelante e = new InitHaciaAdelante();
        System.out.println(e.MAX);
        //e.imprimir();
    }

    public void imprimir(){
        System.out.println("valor i: " + i);
        System.out.println("valor j: " + j);
    }
}
