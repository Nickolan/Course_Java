package Sesion16.OperacionesTerminales.ReduceMethod;

import java.util.List;
import java.util.stream.Stream;

public class ReduceMethod {
    public static void main(String args[]){
        Stream<String> infinite = Stream.generate(()->"hello");
        List<String> list = List.of("monkey", "gorilla", "bonobo");
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> fourElement = Stream.of(3,5,6,7);
        Stream<Integer> empty = Stream.of();

        //----reduce
        System.out.println("----reduce");
        String value= list.stream().reduce("| |", (a,b)->a.concat(b));
        System.out.println(value);

        System.out.println("----sin identity");
        //---- sin identity
        empty.reduce((a,b)->a*b).ifPresent(System.out::println);
        oneElement.reduce((a,b)->a*b).ifPresent(System.out::println);
        fourElement.reduce((a,b)->a*b).ifPresent(System.out::println);

        System.out.println("reduce");
        //---- reduce
        int tamanio = list.stream().reduce(0,(a,b)->a+b.length(), (c,d)->c*d);

        System.out.println(tamanio);
    }
}
