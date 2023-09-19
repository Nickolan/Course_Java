package Sesion4.StringInterning;

public class StringInterning {
    public static void main(String args[]){
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3 == str4);

        System.out.println(str1 == str3.intern());
        System.out.println(str3.intern() == str4.intern());
    }
}
