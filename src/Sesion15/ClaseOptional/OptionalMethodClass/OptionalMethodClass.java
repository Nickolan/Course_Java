package Sesion15.ClaseOptional.OptionalMethodClass;

import java.util.Optional;

public class OptionalMethodClass {
    public static void main(String args[]){
        Optional<Double> op1 = promedio(20, 18, 17, 12);
        Optional<Double> op2 = promedio();

        op1.ifPresent(o -> System.out.println(o));  //16.75
        op2.ifPresent(o -> System.out.println(o));  //
        System.out.println(op1.orElse(20.50)); //16.75
        System.out.println(op2.orElseGet(() -> 20.50)); //20.5
        //op2.orElseThrow();
        op1.orElseThrow(() -> new RuntimeException());
        //op2.orElseThrow(() -> new RuntimeException());

        Optional<Double> opt3 = Optional.ofNullable(null);
        opt3.orElseThrow(() -> new RuntimeException());
    }

    public static Optional<Double> promedio(int... scores){
        if (scores.length == 0) return Optional.empty();

        int suma = 0;
        for (int nota: scores)
            suma += nota;
        return Optional.of((double) suma/scores.length);
    }
}
