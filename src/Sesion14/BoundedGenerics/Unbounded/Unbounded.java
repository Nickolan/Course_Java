package Sesion14.BoundedGenerics.Unbounded;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void printList(List<?> list){
        for (Object x: list)
            System.out.println(x);
    }

    public static void main(String args[]){
        List<Object> objetos = new ArrayList<>();
        List<?> objetos2 = new ArrayList<String>();
        List<Integer> integers = new ArrayList<>();
        List<String> keywords = new ArrayList<>();

        // tipos incompatibles:
        // List<Object> <-- List<String>
        // objetos = keywords; // objetos es String, solo puede ser String

        // compatible: List<?> <-- List<String>
        objetos2 = keywords;    // objetos 2 es indefinido "?", puede ser lo que sea
        objetos2 = integers;

        keywords.add("un string");
        keywords.add("2 strings");
        printList(keywords);
    }
}
