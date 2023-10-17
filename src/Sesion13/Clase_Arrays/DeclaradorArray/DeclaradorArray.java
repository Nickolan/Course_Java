package Sesion13.Clase_Arrays.DeclaradorArray;

public class DeclaradorArray {
    public static void main(String args[]){



        String[] nombres = {"Juan", "Carlos"};
        Object[] objetos = nombres;
        objetos[0] = new String("Hello");
        //objetos[1] = new Object();

        Integer[] notas = {20, 19, 18};
        Number[] notas2 = notas;
        //notas2[0] = new Integer(2);

        /*
        String[] nombres2 = {"Juan", "Carlos"};
        Object[] objetos2 = new String[] {"Juan", "Carlos"};
        objetos2[0] = new Object();
        System.out.println("Ok");

         */
    }
}
