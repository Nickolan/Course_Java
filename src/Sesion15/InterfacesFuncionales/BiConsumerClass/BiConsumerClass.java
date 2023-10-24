package Sesion15.InterfacesFuncionales.BiConsumerClass;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerClass {
    public static void main(String args[]){
        var map = new HashMap<String, String>();
        Map<String, ? super String> map2 = new HashMap<String, String>();

        //  ----- COSUMERS -----
        BiConsumer<String, String> b1 = (k, v) -> map.put(k,v);
        BiConsumer<String, ? super String> b3 = (k, v) -> map.put(k,v);
        BiConsumer<String, Integer> b2 = (k,v) -> System.out.println(k+" "+v);


        b1.accept("cod1", "Carlos");
        b1.accept("cod2", "Juan");
        b1.accept("cod3", "Santiago");
        System.out.println(map);

        b2.accept("cod1", 23);
    }
}
