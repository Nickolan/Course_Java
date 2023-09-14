package Sesion3;

public class Sesion3 {
    public static void main(String args[]){
        //1. Operadores Unitarios
            //Incremento/Decremento post pre
            int a = 10;
           // int b = -10;
            a++; // 11
            //b++; // -9
            --a; // a--;

            //Bitwise complement (~)
            byte b1 = 1;
            byte b2 = (byte) ~b1;   // b2 = -2
            //System.out.println(Integer.toBinaryString(1)); = 1
            //System.out.println(Integer.toBinaryString(5)); = 101

            //complemento logico
            boolean expr1 = false;
            boolean expr2 = !expr1;

        //2. Cast
        int int1 = (int) 200.00;

        //3. Operadores Aritmeticos
            //Concatenacion String
            String str1 = "Hello";
            String str2 = " world";
            String s = str1 + str2;

        //4. Relacionales
            //==
            Integer i = 10;
            Double d = 10.0;
            // false, referencias de distintos tipos

            Integer integera = 1000;    // mas de 127 no estan en cache y no los reconoce como datos iguales
            Integer integerb = 1000;
            //System.out.println(integera == integerb);

            //intanceof
            Object obj = "hello";
            boolean isString = (obj instanceof String);
            boolean isNumber = (obj instanceof Number);

        //EXPRESSIONS&STATEMENTS
        int a2 = 10;
        int b3 = 20;

        int d3 = (a2 = a2 + b3);

        int d4 = 0;
        int int3 = ++d4;


        long result = 170 / 1000000000;
        System.out.println(result);
    }
}
