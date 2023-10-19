package Sesion14.Collecciones.MethArrayList;

import java.util.ArrayList;

public class MetodosArrayList {
    public static void main(String args[]){
        //ADD
        System.out.println("---- Add method ----");
        ArrayList list = new ArrayList(); //ArrayList Objetos
        list.add("hello");
        list.add(Boolean.TRUE);

        ArrayList<String> safer = new ArrayList<>();
        safer.add("string");
        //safer.add(Boolean.TRUE);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        // [Juan]
        nombres.add("Roberto");
        // [Juan, Roberto]
        nombres.add(1, "Maria");
        // [Juan, Maria, Roberto]
        nombres.add(3, "Pedro");
        // [Juan, Maria, Roberto, Pedro]

        nombres.add(2, "Ignacion"); //IndexOutOfBounds ...
        System.out.println(nombres);

        //SET
        System.out.println("--- set method ---");
        System.out.println(nombres.set(2, "Maria")); // Ignacio
        System.out.println(nombres);

        //REMOVE
        System.out.println("--- remove method ---");
        System.out.println(nombres.remove(0));  // Juan
        // [Maria, Maria, Roberto, Pedro]
        System.out.println(nombres.remove("Alejandra"));  // False
        // [Maria, Maria, Roberto, Pedro]
        System.out.println(nombres);
    }
}
