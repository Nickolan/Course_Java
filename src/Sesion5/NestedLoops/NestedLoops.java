package Sesion5.NestedLoops;

public class NestedLoops {
    public static void main(String args[]){
        // ---- Loops Anidados
        int [][] values = {{1, 2, 3}, {2, 3}, {2}, {4, 5, 6, 7}};

        int sum = 0;
        for (int i = 0; i<values.length; i++){
            for (int j=0; j<values[i].length; j++){
                sum = sum + values[i][j];
            }
        }
        System.out.println("Sum is " + sum);

        System.out.println("CONTINUE");
        // ---- Uso Continue
        // imprimiendo el elemento de cada elemento
        int [][] values2 = {{1, 2, 3}, {4, 5}, {6}, {7, 8, 9}};

        out2:
        outfor: for (int i = 0; i<values2.length; i++){
            innfor: for (int j = 0; j<values2[i].length; j++){
                if (j >0) continue outfor;
                System.out.println(values2[i][j]);
            }
        }

        System.out.println("BREAK");
        // ---- Uso Break
        int[][] values3 = {{1, 2, 3}, {4, 5}, {6}, {7, 8, 9}};
        OUT:{
            OUTER: for (int i = 0; i<values3.length; i++){
                for (int j=0; j<values3[i].length; j++){
                    if(j>0) break OUT;
                    System.out.println(values3[i][j]);
                }
            }
        }




    }
}
