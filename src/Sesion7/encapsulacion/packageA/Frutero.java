package Sesion7.encapsulacion.packageA;

import Sesion7.encapsulacion.packageB.Manzana;
import Sesion7.encapsulacion.packageC.ManzanaVerde;

public class Frutero {
    public static void main(String args[]){
        Fruta fruta = new Fruta();
        fruta.id = 1;
        fruta.name = "frutero";
        System.out.println(fruta.id);
        System.out.println(fruta.name);
        Fruta manzana = new Manzana();
        System.out.println(manzana.id);

        ManzanaVerde manzanaVerde = new ManzanaVerde();
    }
}
