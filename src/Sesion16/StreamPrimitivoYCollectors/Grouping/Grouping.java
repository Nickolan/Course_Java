package Sesion16.StreamPrimitivoYCollectors.Grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {
    public static void main(String args[]){
        System.out.println("---- groupingBy ----");
        var pets = Stream.of("loro","gato","perro","conejo");
        Map<Integer, List<String>> map = pets.collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        System.out.println("---- groupingBy2 ----");
        var pets3 = Stream.of("loro","gato","perro","conejo");
        Map<String, List<String>> map3 = pets3.collect(Collectors.groupingBy(a->a.concat("__")));
        System.out.println(map3);

        System.out.println("---- partitioningBy ----");
        var pets2 = Stream.of("loro","gato","perro");
        Map<Boolean, List<String>> map2 = pets2.collect(Collectors.partitioningBy(s->s.length()<5));
        System.out.println(map2);
    }
}
