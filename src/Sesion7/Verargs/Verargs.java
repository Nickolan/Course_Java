package Sesion7.Verargs;

public class Verargs {
    public static void main(String args[]){
        System.out.println(avarage(2, 2, 3, 4));
    }

    public static double avarage(int x, int... values){
        double sum = 0;
        for (int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum / values.length;
    }
}
