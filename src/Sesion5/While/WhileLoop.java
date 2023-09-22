package Sesion5.While;

public class WhileLoop {
    public static void main(String args[]){
        int k = 4;
        while(k-- > 0){
            System.out.println("loop 1");
        }

        int j = 0;
        while (j<0){
            System.out.println("siempre");
        }

        int i = 4;
        while (i-->0){
            ;
        }
        int n=4;
        while(n<0);


        //DoWhile
        int m = 4;
        do {
            System.out.println("loop 2");
        }while (m-- > 0);


        //Test DoWhile
        var b = false;
        var z = 1;
        do {
            z++;
        }while (b = !b);
        System.out.println(z);
    }

}
