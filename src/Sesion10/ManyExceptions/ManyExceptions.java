package Sesion10.ManyExceptions;

public class ManyExceptions {
    public static void main(String args[]) throws Exception{
        try{
            try{
                throw new RuntimeException();
            }catch (RuntimeException e){
                throw new RuntimeException();
            } finally {
                throw new Exception();
            }
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        }
        catch (Exception e){
            System.out.println("ok");
        }
    }
}
