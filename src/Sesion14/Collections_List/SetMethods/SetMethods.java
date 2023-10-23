package Sesion14.Collections_List.SetMethods;

import java.util.*;

public class SetMethods {
    public static void main(String args[]){
        //addAll
        System.out.println("---- addAll ----");
        Set<Integer> number1 = new HashSet<>();
        number1.add(0);
        number1.add(2);
        List<Integer> numbers2 = Arrays.asList(1, 4, 3);
        System.out.println(number1.addAll(numbers2));
        System.out.println(number1);

        System.out.println("---- Set.of ----");
        Set<Character> letter = Set.of('a', 'b');
        //letter.add('c'); no se permite agregar elementos
        System.out.println(letter);
        Set<Character> copy = Set.copyOf(letter);
        System.out.println(copy);

        System.out.println("---- HashSet ----");
        Set<String> names = new HashSet<>();
        names.add("Oscar");
        names.add("Maria");
        names.add("Juan");
        names.add("Pedro");
        names.add("Maria"); // false
        System.out.println(names);  //[Pedro, Juan, Maria, Oscar]
        names.forEach(x -> System.out.println(x));

        System.out.println("---- TreeSet ----");
        Set<String> namesTree = new TreeSet<>();
        namesTree.add("Maria");
        namesTree.add("Juan");
        namesTree.add("Pedro");
        namesTree.add("Maria"); // False
        System.out.println(namesTree);  //[Maria, Juan, Pedro]
        namesTree.forEach(x -> System.out.println(x));
    }
}
