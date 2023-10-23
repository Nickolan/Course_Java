package Sesion14.Collections_List.MethodsMap.MapMethods3;

import java.util.HashMap;
import java.util.Map;

public class MapMethods3 {
    public static void main(String args[]){
        System.out.println("--- HashMap ---");
        Map<String, String> map1 = new HashMap<>();
        map1.put("cod1", "Juan");
        map1.put("cod2", "Carlos");
        map1.put("cod3", "Karla");

        // --- ForEach and EntrySet
        System.out.println("--- ForEach and EntrySet ---");
        map1.forEach((k, v) -> System.out.println(v + " " + k));

        map1.values().forEach(v -> System.out.println(v));
        System.out.println("entryset");
        map1.entrySet().forEach(e -> System.out.println(e.getValue() + e.getKey()));

        //getOrDefault
        System.out.println("--- GetOrDefault ---");
        System.out.println(map1.get("cod4")); //null
        System.out.println(map1.getOrDefault("cod4", "No encontrado"));

        //replace and replace all
        System.out.println("--- Replace and replaceAll ---");
        String original = map1.replace("cod1", "Maria");
        System.out.println("Original " + original);
        System.out.println(map1);

        map1.replaceAll((k, v) -> k+v);
        System.out.println(map1);

        map1.putIfAbsent("cod1", "Maria");
        map1.putIfAbsent("cod4", "Maria");
        System.out.println(map1);
    }
}
