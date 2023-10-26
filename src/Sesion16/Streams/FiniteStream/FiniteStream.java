package Sesion16.Streams.FiniteStream;

import java.util.List;
import java.util.stream.Stream;

public class FiniteStream {
    public static void main(String args[]){
        System.out.println("---- Finite Stream ----");
        Stream<String> empty = Stream.empty(); // empty
        Stream<Integer> singleElement = Stream.of(1); // de 1 valor
        Stream<Integer> fromArray = Stream.of(1, 2, 3); //de un array
        //a partir de una coleccion
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();

        fromList.forEach(System.out::println);

        System.out.println("---- Inifite Stream -----");
        Stream<Integer> oddNumbersUdner200 = Stream.iterate(1, n->n<200, n -> n+2);
        oddNumbersUdner200.forEach(System.out::println);
    }
}
