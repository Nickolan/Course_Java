package Sesion7.NestedClases;

public class NestedClases {
    public String className;

    //1. inner class
    public class Inner{
        private String saludo = "hello";
        public static int MAX = 10;
        public void saludar(){
            System.out.println(saludo);
        }
        public static void impresion(){}
    }

    //2. static inner class
    public static class StaticInner{
        private String saludo = "hello";
        public void saludar(){
            System.out.println(saludo);
        }
        public static void impresion(){}
    }

    public void imprimir(){

        //3. Local Class
        class LocalClass{
            private String saludo = "hello";
            public static int MAX = 10;
            public void saludar(){
                System.out.println(saludo);
            }
        }

        //4. Anonymous Class
        Inner NewInner = new Inner(){
            public static int MAX = 10;
            private String saludo = "hello";
            public void saludar(){
                System.out.println(saludo);
            }
        };
    }

    public static void main(String args[]){
        NestedClases outer = new NestedClases();

        NestedClases.Inner inner = outer.new Inner();
    }
    private void invocandoNested(){
    }
}
