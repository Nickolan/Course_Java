package Sesion8.Upcasting;

public class Upcasting {
    public static void main(String args[]){
        Apple a = new Apple();
        System.out.println(a.COUNT);
        System.out.println(((Fruit)a).COUNT);
        System.out.println(a.getCount());
    }
}

class Fruit{
    static int COUNT = 5;
}

class Apple extends Fruit{
    static int COUNT = 10;
    public int getCount(){
        return super.COUNT;
    }
}

class  Fruter{
    static int COUNT = 5;
}
