package Sesion6.StaticAndInstance;

public class StaticAndInstance {
    String nameInstance;
    static int numberOfInstance;
    public static void main(String args[]){
        System.out.println(StaticAndInstance.numberOfInstance);

        StaticAndInstance acct1 = new StaticAndInstance();

        acct1.nameInstance = "first instance";
        acct1.numberOfInstance = 10;

        StaticAndInstance acct2 = new StaticAndInstance();
        acct2.nameInstance = "second instance";
        acct2.numberOfInstance = 20;

        System.out.println("name1: " + acct1.nameInstance);
        System.out.println("number1: " + StaticAndInstance.numberOfInstance);
        System.out.println("name2: " + acct2.nameInstance);
        System.out.println("number2: " + acct2.numberOfInstance);

        StaticAndInstance acct3 = new StaticAndInstance();
        acct3.nameInstance = "third instance";
        System.out.println("name3: " + acct3.nameInstance);
        System.out.println("number3: " + StaticAndInstance.numberOfInstance);
    }
}
