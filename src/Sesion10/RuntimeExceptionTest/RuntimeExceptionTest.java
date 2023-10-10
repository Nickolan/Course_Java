package Sesion10.RuntimeExceptionTest;

public class RuntimeExceptionTest {
    static String name;
    public static void main(String args[]){
        //ArithmeticException
        int respuesta = 10/0;

        //ArrayIndexOutOfBoundsException
        int[] countOfMoose = new int[3];

        //ClassCastException
        Object type = "moose";
        // Integer number = (integer) type;

        //NullPointerException
        System.out.println(name.length());

        //IllegalArgumentException
        RuntimeException e = new RuntimeException();
        //e.setAge(-1)

        //NumberFormatException
        Integer.parseInt("10.0");
    }
    public void setAge(int age){
        if (age < 0) throw new IllegalArgumentException("Invalid age");
    }
}
