package Sesion15.ClaseOptional.EncadenandoOptionals;

import java.util.Optional;

public class EncadenandoOptionals {

    public static void main(String args[]){
        Optional<Integer> opt = Optional.of(523);
        Optional<Integer> opt2 = Optional.ofNullable(null);
        threeDigit(opt);    // 523
        threeDigit(opt2);
        //printString(opt2);

        opt.flatMap(EncadenandoOptionals::calculate)
                .ifPresent(System.out::println);
    }
    private static void threeDigit(Optional<Integer> optional){
        optional.map(n-> ""+n)
                .filter(s-> s.length() ==3)
                .ifPresent(System.out::println);
    }

    private static void printString(Optional<String> optional){
        optional.filter(s-> s.length() ==3)
                .ifPresent(System.out::println);
    }

    private static Optional<Integer> calculate(Integer val){
        return Optional.of(val*2);
    }
}
