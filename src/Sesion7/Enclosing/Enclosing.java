package Sesion7.Enclosing;

public class Enclosing {
    private int length = 5;
    public void sumar(){
        final int width = 10;
        int area = 34;
        class LocalClass{
            public int multiplicar(){
                System.out.println(length*width*area);
                return length*width*area;   //1700
            }
        }
        LocalClass local = new LocalClass();
        local.multiplicar();
        //area = 35; error
    }

    public static void main(String args[]){
        Enclosing outer = new Enclosing();
        outer.sumar();
    }
}
