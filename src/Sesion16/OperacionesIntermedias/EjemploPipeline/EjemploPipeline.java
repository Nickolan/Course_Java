package Sesion16.OperacionesIntermedias.EjemploPipeline;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EjemploPipeline {
    public static void main(String args[]){

        Stream.generate(()->"Elsa")
                .filter(n->n.length()==4)
                .peek(a-> System.out.println(a))
                .limit(2)
                .sorted()
                .forEach(System.out::println);


        var list = List.of(5,2,7,12,17,8);

        list.stream()
                .filter(n->n%2==0)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .forEach(System.out::println);


        System.out.println("---- INFINITE ----");

        var infinite = Stream.iterate(1, x->x+1);

            infinite.filter(x-> x%2==1)
                    .peek(System.out::println)
                    .limit(5)
                    .forEach(System.out::println);
    }
}
