package Sesion7.Sobrecarga;

public class Sobrecarga {
//    public void procesarData(Long value){
//        System.out.println("opcion 1");
//    }

    public void procesarData(Long... value){
        System.out.println("opcion 2");
    }
    public void procesarData(Double value){
        System.out.println("opcion 3");
    }

    public static void main(String args[]){
        Sobrecarga s = new Sobrecarga();
        //s.procesarData(10);
        Long vlong = Long.valueOf(1001);
        s.procesarData(vlong);
    }
}
