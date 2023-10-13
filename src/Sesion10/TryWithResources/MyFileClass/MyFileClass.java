package Sesion10.TryWithResources.MyFileClass;

public class MyFileClass implements AutoCloseable{
    private final int num;
    public MyFileClass(int num){
        this.num = num;
    }

    public void close(){
        System.out.println("Closing: " + num);
    }
    public static void main(String args[]){
        try(MyFileClass a1 = new MyFileClass(1); MyFileClass a2 = new MyFileClass(2)){
            System.out.println("iniciando bloque try");
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("exception");
        }finally {
            System.out.println("finally");
        }
    }
}
