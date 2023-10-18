package Sesion13.Arrays_Multidimensionales.Multidimensional;

import com.sun.jdi.IntegerValue;

public class Multidimensional {
    public static void main(String args[]){
        //Creacion e inicializacion unideimensional
        int b[] = new int[]{1, 2, 3};
        int [][][] a1 = new int[2][][];

        //Creacion e inicializacion multidimencional

        //Inicializaciones equivalentes
        int [][] a2 = new int[][]{new int[]{1, 2, 3}};
        System.out.println("a2.length: " + a2.length);
        int [][] a3 = new int[][]{{1, 2, 3, 4}};
        System.out.println("a3.length: " + a3.length);
        System.out.println("a3[0].length: " + a3[0].length);
        Object[] obj[] = {{"una cadena"}, {null}, {new Object()}};

        //Asignaciones
        System.out.println("----- Asignaciones ----");
        int[][] c = new int[3][4];
        Object[] b1 = c;    // si compila

        Object[] oa = new int[2][3]; // si compila

        //Object[][] oaa = new int[2][3]; // no compila
    }
}
