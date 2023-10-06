package Sesion8.Abstract;

abstract class Vehiculo {
    private String tipo;

    // Metodos Abstractos: public, protected, default
    abstract String getTipo();
    public abstract void ensamblarse();

    // Metodos Concretos:
    // Metodo Final y static: public, private, protected, default
    final void imprimir(){
        System.out.println("hello final world");
    }
    private final void imprimir2(){};
    protected  static  void ensamblarse2(){};

    // MAIN
    public static void main(String args[]){
        //Vehiculo ve = new Vehiculo(); // no compila



        Auto auto = new Auto();
        auto.imprimir();
    }
}

class Auto extends Vehiculo{
    public String getTipo(){
        return "Auto";
    }
    public void ensamblarse(){
        System.out.println("Auto Class");
    };
}

final class AutoFinal extends Vehiculo{
    public String getTipo(){ return "Hola autofinal";}
    public void ensamblarse(){}
}

//final class AutoHija extends AutoFinal{
//    public String getTipo(){ return "Hola autoHija";}
//    public void ensamblarse(){}
//}