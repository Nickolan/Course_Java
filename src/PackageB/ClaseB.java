package PackageB;
import PackageA.ClaseA;

public class ClaseB {

    public static void main(String[] args){
        String test2 = "Prueba B";
        ClaseA cls = new ClaseA();
        System.out.println(cls.test + " Y " + test2);
    }
}
