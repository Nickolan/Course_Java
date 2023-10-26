package Sesion16.OperacionesIntermedias.IntermediateOperations;

import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String args[]){
        System.out.println("----Filter----");
        Stream<String> pets = Stream.of("gato","perro","gallina","gato","loro");
        pets.filter(s->s.startsWith("g"))   // filtra segun parametros solicitados
                .forEach(System.out::println);

        System.out.println("---- Distinct ----");   // elimina repetidos
        pets = Stream.of("gato","perro","gallina","gato","loro","perro");
        pets.distinct().forEach(System.out::println);

        System.out.println("---- Skip, Limit ----");
        Stream<Integer> infinite = Stream.iterate(1, n->n+1);
        infinite.skip(4).limit(2).forEach(System.out::println);
        // skip: saltea a la posicion solicitada
        //limit: limita el numero de iteraciones
    }
}
