package Sesion7.NestedClases2;


public class NestedClases2 {
    private int x = 10;
    class B {
        private int x = 20;
        class C{
            private int x = 30;
            public void allTheX(){
                System.out.println(x); //30
                System.out.println(this.x); //30
                System.out.println(B.this.x); //20
                System.out.println(NestedClases2.this.x); //10
            }
        }
    }

    public void imprimir(){
        B b = new B();
        B.C c = b.new C();
        System.out.println("imprimir " + c.x);
    }
    public static void main(String[] args){
        NestedClases2 a = new NestedClases2();
        NestedClases2.B b = a.new B();
        NestedClases2.B.C c = b.new C();
        c.allTheX();
        a.imprimir();
    }
}
