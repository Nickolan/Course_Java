package Sesion4.StringBuilder;

public class StringBuilderData {
    public static void main(String args[]){
        //Constructor
        /*
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); // ""
        System.out.println("Length => " + sb1.length());
        System.out.println("Capacity => " + sb1.capacity());
        */

        StringBuilder sb = new StringBuilder("abcde");
        
        //append e insert
        System.out.println("---- append e insert ----");
        System.out.println(sb.append(true));
        System.out.println(sb.append(12.0));
        System.out.println(sb.append(12.0f));
        System.out.println(sb.append(new Object()));

        System.out.println(sb.insert(5,"__"));
        //abcde__true12.012.0java.lang.Object@214c265e

        //System.out.println(sb.insert(-1,"__"); //StringIndexOutOfBoundsException

        //Metodo de referencia
        System.out.println("---- metodos de referencia ----");
        sb = new StringBuilder("abcde");

        System.out.println(sb.reverse());
        System.out.println(sb.delete(5,7)); // no arroja excepcion
        System.out.println(sb.replace(1, 3,"--"));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));

        System.out.println("---- metodos de referencia end ----");


        StringBuilder sb2 = new StringBuilder("abcde");

        System.out.println(sb2.indexOf("e")); //4
        System.out.println(sb2.indexOf("a", 1)); // -1
        System.out.println(sb2.substring(2)); // cde
        System.out.println(sb2.substring(2, 5)); // cde
        System.out.println(sb2.toString()); // abcde

        // substring and delete
        sb2 = new StringBuilder("abcde");
        String str2 = sb2.substring(0, 2);
        System.out.println(str2 + " " + sb2);
        StringBuilder sb3 = sb2.delete(0, 2);
        System.out.println(sb3 + " " + sb2);


    }
}
