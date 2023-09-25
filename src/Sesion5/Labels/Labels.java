package Sesion5.Labels;

public class Labels {
    public static void main(String args[]){
        label:{
            System.out.println("impresion valida");
        }

        single: System.out.println("single statement");
        single2:{
            System.out.println("single statement 2");
        }

        int a = 1, b = 1;

        hello:
            if (a==b) System.out.println("true");
            else System.out.println("false");

        int i = 0;
        come_here: while(i>0){
            System.out.println("hello");
        }

        some_label: {
            System.out.println("hello1");
            System.out.println("hello2");
        }
    }
}
