package Sesion3.Strings;

public class StringConstructors {
    public static void main(String args[]){
        System.out.println("--- String vacio");
        String str1 = new String();
        System.out.println(str1);

        System.out.println("--- Con literal");
        String str2 = "hello2";
        String str3 = new String("Hello3");
        System.out.println(str3);
        System.out.println(str2);

        System.out.println("--- String a partir de SB");
        StringBuilder sb = new StringBuilder();
        sb.append("hello world");
        String str4 = new String(sb);
        System.out.println(str4);

        System.out.println("--- String a partir de arrays");
        byte[] barray = new byte[]{97, 98, 99};
        String str5 = new String(barray);
        System.out.println(str5);

        char[] carray = new char[]{'a', 'b', 60};
        String str6 = new String(carray);
        System.out.println(str6);

        String str7 = String.valueOf(8);
        System.out.println(str7);
    }
}