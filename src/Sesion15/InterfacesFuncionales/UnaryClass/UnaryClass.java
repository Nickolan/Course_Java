package Sesion15.InterfacesFuncionales.UnaryClass;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryClass {
    public static void main(String args[]){
        UnaryOperator<String> f1 = x->x.toUpperCase() ;
        System.out.println(f1.apply("cadena"));

        //BinaryFunction<String, String, String>
        BinaryOperator<String> b1 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("cadena", " rota"));

        Comparator<String> c1 = (a,b)-> a.length() + b.length();
        System.out.println(c1.compare("dos", "tres"));
    }




}
