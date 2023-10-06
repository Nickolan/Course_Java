package Sesion8.ReferenceCasting;

public class ReferenceCasting {
    public static void main(String args[]){
        Apple a = new Apple();
        Mango m = new Mango();
        Fruit f1 = a;   // apple is a fruit
       // m = a; // no compila, apple no es un mango

        Fruit f2 = m; // ok, mango is a fruit
        if (f2 == m){
            System.out.println("referencias iguales");
        }
        //m = f2; // fruit is not a mango
        Mango m2 = (Mango) f2; // f2 es Fruta pero apunta a un objeto Mango

        //Fruit f = new StartFruit();
        Fruit f = new StartFruit();
        Poison p = (Poison) f;
        //System.out.println("Casting ok");
    }
}

interface Poison{}

class Fruit{}
class Mango extends Fruit{}
class Apple extends Fruit{}
class StartFruit extends Fruit implements Poison{}