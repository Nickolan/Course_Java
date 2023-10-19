package Sesion14.Collecciones.MethArrayList2;

import java.util.ArrayList;

public class MetodosArrayList2 {
    public static void main(String args[]){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Roberto");
        nombres.add("Pedro");

        System.out.println("--- set method ---");
        System.out.println(nombres.set(0, "Maria")); // Juan
        System.out.println(nombres); // [Maria, Roberto, Pedro]

        System.out.println("--- lecturas ---");
        System.out.println(nombres.contains("Maria")); // true
        System.out.println(nombres.isEmpty());  // false
        System.out.println(nombres.size()); // 3

        System.out.println("--- clear and cointains ---");
        System.out.println(nombres.contains("Maria")); // true
        nombres.clear();
        System.out.println(nombres.isEmpty());  // true
        System.out.println(nombres.size()); // 0
    }
}
