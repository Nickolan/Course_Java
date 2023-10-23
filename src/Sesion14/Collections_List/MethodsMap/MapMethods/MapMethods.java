package Sesion14.Collections_List.MethodsMap.MapMethods;

import java.util.Map;

public class MapMethods {
    public static void main(String args[]){
        System.out.println("--- Map.Of ---");
        Map<String, String> map1 = Map.of("Key1", "val1", "Key2", "val2");
        //map1.put("key3", "val3");
        System.out.println(map1);

        System.out.println("--- Map.ofEntries ---");
        Map<String, String> map2 = Map.ofEntries(Map.entry("key1", "val1"), Map.entry("key2", "val2"));
        System.out.println(map2);

        System.out.println("--- Map.copyOf ---");
        Map<String, String> map3 = Map.copyOf(map2);
        System.out.println(map3);
        System.out.println(map2.equals(map3)); //true
    }
}
