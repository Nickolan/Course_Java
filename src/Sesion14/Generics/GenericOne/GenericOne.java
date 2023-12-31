package Sesion14.Generics.GenericOne;

public class GenericOne {
    public static void main(String args[]){
        Elefante e1 = new Elefante();
        Jaula<Elefante> jaula1 = new Jaula<>();
        jaula1.enjaular(e1);
        Elefante e2 = jaula1.emptyJaula();

        Zebra z1 = new Zebra();
        Jaula<Zebra> jaula2 = new Jaula<>();
        jaula2.enjaular(z1);
        Zebra z2 = jaula2.emptyJaula();
    }
}

class Jaula<A>{
    private A contents;
    public A emptyJaula(){
        return contents;
    }
    public void enjaular(A contents){
        this.contents = contents;
    }
}

class Elefante{}
class Zebra{}
