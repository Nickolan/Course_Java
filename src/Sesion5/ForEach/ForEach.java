package Sesion5.ForEach;

import java.util.HashSet;
import java.util.Set;

public class ForEach {
    public static void main(String args[]){

        System.out.println("Loop Normal");
        String[] values = {"a", "b", "c"};
        for(String e:values){
            System.out.println(e);
        }

        System.out.println("Loop with break");
        for (String e: values){
            if (e.equals("a")){
                System.out.println(e);
                break;
            }
            System.out.println(e);
        }
        System.out.println("Loop with continue");
        for (String e: values){
            if (e.equals("a")){
                continue;
            }
            System.out.println(e);
        }
        /*
        Set s = new HashSet();
        s.add("a"); s.add("bb"); s.add("ccc");

        for (Object value: s){
            System.out.println(value);
        }
         */
    }
}
