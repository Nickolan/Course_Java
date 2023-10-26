package Sesion16.OperacionesIntermedias.IntermediateOperations2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations2 {
    public static void main(String args[]){

        System.out.println("---map---");
        Stream<String> pets = Stream.of("gato","perro","gallina","gato","loro");
        pets.map(String::length)
                .forEach(System.out::println); // 4,5,7,4,4


        System.out.println("---- FlatMap ----");
        // Realiza un mapeo con cada elemento al mismo nivel
        List<String> zero = List.of("Pedro");
        var one = List.of("Juan");
        var two = List.of("Maria","Ana");
        Stream<List<String>> nombres = Stream.of(zero, one, two);
        nombres.flatMap(m->m.stream())
                .forEach(System.out::println);


        System.out.println("--- Sorted ----");
        List<String> colores = List.of("morado","lila","amarillo", "anaranjado");
        colores.stream().sorted().forEach(System.out::println);


        System.out.println("---- Sorted with Comparator ----");
        colores.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        System.out.println("---- Peek ----");
        long count = colores.stream()
                .filter(s->s.startsWith("a"))
                .peek(System.out::println).count();
        System.out.println(count);

        colores.stream()
                .filter(s-> !s.startsWith("m"))
                .sorted()
                .limit(3)
                .forEach(System.out::println);

    }
}
