package Sesion5.Switch;

public class Switch {
    public static void main(String args[]){
        int a = 30;
        switch (a){}
        switch (a){
            case 10|20:{
                System.out.println("dentro");
                a++;
                System.out.println(a);
            }
        }
        switch (a){
            case 10: System.out.println("Correcto");
        }

        int suma = 0;
        switch (1){
            case 1: suma++;
            case 2: suma++; break;
            case 3: suma++;
            default: suma++;
        }
        System.out.println("Suma: " + suma);

        int exp = 0;
        switch (exp){
            case 0:System.out.println("0 arguments"); break; //importante agregar break;
            case 1:System.out.println("1 arguments");
        }
    }
}
