package Sesion15.InterfacesFuncionales.FunctionClass;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncitonClass {
    public static void main(String args[]){

        // Function <(Recibe), (Retorna)>
        Function<String, Integer> f1 = x->x.length();
        Function<String, Integer> f2 = x-> 200;
        System.out.println(f2.apply("cadena"));

        // BiFunction <(Recibe1), (Recibe2), (Retorna)>
        BiFunction<String, String, String> b1 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("cadena", " rota"));

        BiFunction<String, Integer, String> b2 = (string, intval) -> string + intval;
        System.out.println(b2.apply("cadena", 123));
    }
}
