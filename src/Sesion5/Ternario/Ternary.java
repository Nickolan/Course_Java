package Sesion5.Ternario;

public class Ternary {
    public static void main(String args[]){
        // --- Operandos numericos

        //primitivos numericos (amplitud)
        int a = 1, b=2;
        double double1 = a == b? 5: 10.0;
        var int0 = a == b? 5:10.0;

        //primitivo numericos y wrapper
        int intPrim1 =  6; double doubPrim1 = 60.0;
        Double double2 = 10.0, double3;
        Byte byte1=1, btye2;
        Integer integer1 = 1000;

        //primitivo y wreapper
        integer1 = false?intPrim1:byte1;
        double2 = false?intPrim1:doubPrim1;

        //wraper y wraper
        double3 = false?double1:byte1;

        //Asociacion derecha
        int a2 = true?false?0:1:2;
        System.out.println(a2);

        int a1 = true?(false?0:1):2;
        System.out.println(a1);
    }
}
