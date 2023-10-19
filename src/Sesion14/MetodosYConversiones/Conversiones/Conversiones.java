package Sesion14.MetodosYConversiones.Conversiones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversiones {

    public static void main(String args[]){
        //De List A Array
        System.out.println("--- De List a Array ---");
        List<String> list = new ArrayList<>();
        list.add("Juan"); list.add("Maria"); list.add("Pedro");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println(Arrays.toString(stringArray));   // [Juan, Maria, Pedro]
        System.out.println("lista: " + list);   //lista: []
        stringArray[0] = "Juana";
        System.out.println(Arrays.toString(stringArray)); // [Juana, Maria, Pedro]

        // Arrays as List (Es una forma de visualizar el array)
        System.out.println("--- Arrays as List ---");
        String[] stringArray2 = {"three", " four"};
        List<String> list1 = Arrays.asList(stringArray2);
        System.out.println("lista1: " + list1); //lista1: [three, four]
        list1.set(0, "five");
        //list1.add("Six"); //Error
        //list1.remove("five"); //Error
        System.out.println(Arrays.toString(stringArray2)); //[five, four]

        //List.of
        System.out.println("--- List.of ---");
        List<String> list2 = List.of("one", "two");
        System.out.println(list2);
        //list2.set(1, "three");  //ImmutableCollection
        //list2.remove(1);  //ImmutableCollection
    }
}
