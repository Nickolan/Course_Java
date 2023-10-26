package Sesion16.Streams.TerminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String args[]){
        System.out.println("---- count ----");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo"  );
        long conteo = s.count();
        System.out.println(conteo); //3

        System.out.println("---- min ----");
        s = Stream.of("cat", "lion", "mono"  );
        Optional<String> min = s.min((s1, s2) -> s1.compareTo(s2));
        min.ifPresent(System.out::println);

        System.out.println("-----findAny, findFirst");
        s = Stream.of("monkey", "gorilla", "bonobo"  );
        s.findAny().ifPresent(System.out::println);

        Stream<String> infinite = Stream.generate(() -> "hello");
    }
}
