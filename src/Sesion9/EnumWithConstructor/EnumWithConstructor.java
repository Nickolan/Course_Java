package Sesion9.EnumWithConstructor;

public class EnumWithConstructor {
    public static void main(String args[]){
        //System.out.println(DocumentType.DNI);
        DocumentType.CE.printDescription(); //instance method
        //DocumentType.CE.print("static message");
        DocumentType.Pass.sumar(1);
    }
}

enum DocumentType{
    DNI("dni"){
        public void sumar(int op1){
            System.out.println(op1 + 20);
        }
    }, CE("carnet de extranjeria"){
        public void sumar(int op1){
            System.out.println(op1 + 15);
        }
        public void printDescription(){
            System.out.println("C.E = " + this.description);
        }
    }, Pass("password"){
        public void sumar(int op1){
            System.out.println(op1 + 3);
        }
    };

    //Variables de instancia o estaticos
    protected final String description;
    public String name;
    protected static int edad;

    // solo puede ser privado
    private DocumentType (String description){
        System.out.println("in constructor: " + description);
        this.description = description;
    }

    public void printDescription(){
        System.out.println(description);
    }

    public static final void print(String message){
        System.out.println(message);
    }

    public abstract void sumar(int op1);
}
