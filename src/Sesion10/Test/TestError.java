package Sesion10.Test;

public class TestError {
    public static void main(String args[]){
        try {
            throw new RuntimeException();
            //System.out.println("end of method");  unreachable statement
        }catch(Exception e){

        }
    }
}
