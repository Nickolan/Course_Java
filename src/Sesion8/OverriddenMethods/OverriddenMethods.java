package Sesion8.OverriddenMethods;

public class OverriddenMethods {
    public static void main(String args[]){
        Account a = new Account(3.5);
        a.printBalance(); // OKOK
        DummyAccount d = new DummyAccount(10.0);
        d.printBalance(); // no balance


        Account ad = new DummyAccount(3.5);
        ad.printBalance("Correcto");
    }

}

class Account{
    double balance = 0.0;
    Account(double balance){
        this.balance = balance;
    }
    void printBalance(){
        System.out.println("OKOK");
    }
    static void printBalance(String message){
        System.out.println("super " + message);
    }
}

class DummyAccount extends Account{
    DummyAccount(double b){
        super(b);
    }
    void printBalance(){
        System.out.println("No balance");
    }
    static void printBalance(String message){
        System.out.println("sub " + message);
    }
}
