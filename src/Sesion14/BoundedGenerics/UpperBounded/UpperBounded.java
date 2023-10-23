package Sesion14.BoundedGenerics.UpperBounded;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {
    public static long total(List<? extends Number> list){
        long count = 0;
        for(Number number: list)
            count += number.longValue();
        System.out.println(count);
        return count;
    }
    public static void main(String args[]){
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(Integer.valueOf(1));
        numbers.add(Double.valueOf(20.5));
        total(numbers);

        List<Integer> enteros = new ArrayList<Integer>();
        enteros.add(Integer.valueOf(1));
        enteros.add(Integer.valueOf(2));
        enteros.add(Integer.valueOf(3));

        List<? extends  Number> list = enteros;
        //list.add(Integer.valueOf(2));
        total(enteros);
    }
}
