package Sesion7.encapsulacion.packageB;

import Sesion7.encapsulacion.packageA.Fruta;
import Sesion7.encapsulacion.packageC.ManzanaVerde;

public class Manzana extends Fruta {
    public static void main(String args[]){
        Fruta fruta = new Fruta();
        //fruta.id = 111;
        System.out.println(fruta.name);

        Manzana manzana = new Manzana();
        manzana.id = 112;

        ManzanaVerde manzanaVerde = new ManzanaVerde();
        manzanaVerde.id = 113;
        //manzanaVerde.name = "verde";
    }
}
