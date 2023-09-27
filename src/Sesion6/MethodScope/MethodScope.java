package Sesion6.MethodScope;

public class MethodScope {
    static String name = "Juan";
    String clase = "OO";
    public static void main(String args[]){
        //int clase = 0;
        System.out.println(name); //1      // "Juan"
        int j = 3;
        for (int i=0; i<10; i++){
            String name = "Jose";
            System.out.println(name); //2      // "Jose"
        }
        {
            int i=2;
        }
        System.out.println(MethodScope.name);
        String name = "Victor";
        System.out.println(name);
    }
}
