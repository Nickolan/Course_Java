package Sesion15.InterfacesFuncionales.PredicateClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String args[]){
        List<Alumno> list = new ArrayList<Alumno>();
        list.add(new Alumno(20, "Juan"));
        list.add(new Alumno(18, "Carlos"));
        list.add(new Alumno(10, "Pedro"));

        Predicate<Alumno> p1 = (a)-> a.nota>11;

        Predicate<Alumno> p2 = (a)-> a.nombre.startsWith("J");

        System.out.println("--- Filtro 1");
        imprimirListado(list, p1);
        System.out.println("--- Filtro 2");
        imprimirListado(list, p2);

       BiPredicate<Alumno, Integer> p3 = (a1, inc) -> (a1.nota+inc)>11;
        System.out.println("--- Filtro 3");
       imprimirListado2(list, p3);
    }

    public static void imprimirListado2(List<Alumno> alumnos, BiPredicate<Alumno, Integer> p){
        int incremento = 2;
        for (Alumno alum: alumnos){
            if (p.test(alum, 2))
                System.out.println(alum);
        }
    }

    public static void imprimirListado(List<Alumno> alumnos, Predicate<Alumno> p){
        for (Alumno alum: alumnos){
            if (p.test(alum))
                System.out.println(alum);
        }
    }
}

class Alumno{
    public int nota;
    public String nombre;
    public Alumno(int nota, String nombre){
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString(){
        return "nombre: "+this.nombre + ", nota: "+this.nota;
    }
}
