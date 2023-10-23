package Sesion14.Collections_List.ListMethods;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {
    public static void main(String args[]){
        //Replace All
        System.out.println("--- ArrayList ---");
        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.replaceAll(x->x*2);
        System.out.println(numbers); // [2, 4, 6]

        System.out.println("--- LinkedList ---");
        List<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.addAll(numbers);
        System.out.println("lista despues de addAll: " + list1); // [2, 2, 4, 6]

        //RemoveIf
        System.out.println("--- Removed List ---");
        list1.removeIf(x->x>4);
        System.out.println("lista despues de removeIf: " + list1); // [2, 2, 4]

        //Foreach
        System.out.println("--- Foreach ---");
        list1.forEach(x -> System.out.println(x));

        System.out.println("--- List For ---");
        for (Integer a: list1){
            System.out.println(a);
        }
        System.out.println("--- Iterator ---");
        Iterator<Integer> iter = list1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
