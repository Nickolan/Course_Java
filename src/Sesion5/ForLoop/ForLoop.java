package Sesion5.ForLoop;

public class ForLoop {
    public static void main(String args[]){
        // Ejemplos de For

        for (int i=0; i<5; i++){
            System.out.println("for " + i);
        }
        for (var a = 5; a < 7; a++);

        int x = 0;
        for (var a = 5; a < 7; a++, x++, impresion("actualizacion"), System.out.println("siempre"));

        int m = 0;
        for (m++; m<10; m++);

        //For Validos e infinitos
        /*
        for(;;){
            System.out.println("siempre");
        }

        for(;;);
        for(;;) System.out.println("siempre");
         */
    }
    private static void impresion(String str){
        System.out.println(str);
    }
}
