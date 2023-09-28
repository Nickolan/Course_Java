package Sesion7.Metodos;
import java.lang.Integer;
public class Metodos {
    public static void main(String args[]){
        Metodos m = new Metodos();
        float f = m.restar(6, 3);
        System.out.println(f);
    }

    public String imprimirTextos(String texto, int cantidad){
        String result = texto + " impreso " + cantidad+ " veces";
        return result;
    }

    public int sumar(int a, int b){
        return a + b;
    }
    public float restar(int a, int b){
        return a - b;
    }
    public float producto(int a, int b){
        return a * b;
    }

    public int sumar1(int a, int b){
        short s = 10;
        return Short.valueOf(s);
    }
    public int sumar2(int a, int b){
        return Integer.valueOf(a + b);
    }
    /*
    public int restar2(int a, int b){
        return Double.valueOf(a - b);
    }
     */

}
