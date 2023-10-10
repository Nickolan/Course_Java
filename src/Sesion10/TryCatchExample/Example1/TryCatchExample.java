package Sesion10.TryCatchExample.Example1;
public class TryCatchExample {
    public static void main(String args[]){
        try {
            throwException();
            System.out.println("End of try");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException  e){
            System.out.println("Null or ArrayIndex");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        }
    }
    public static void throwException(){
        throw new RuntimeException();
    }
}


