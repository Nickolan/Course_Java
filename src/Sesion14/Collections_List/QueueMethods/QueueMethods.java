package Sesion14.Collections_List.QueueMethods;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        //System.out.println(queue.element()); // Exception, la la cola esta vacia
        System.out.println(queue.peek());   // null, esta vacia

        System.out.println("--- Adding ---");
        System.out.println(queue.offer(100)); //true inserta sin lanzar excepcion
        System.out.println(queue.offer(20)); //true
        System.out.println(queue.offer(4)); //true
        System.out.println(queue.add(50)); //true inserta retorna excepcion en caso de error

        System.out.println(queue); // [100, null, 4, 50]

        System.out.println("---- lecturas ----");
        System.out.println(queue.element()); // 100 examina retorna excepcion en caso de error
        System.out.println(queue.peek()); // 100 examina pero no retorna excepcion

        System.out.println(" ---- removing ----");
        System.out.println(queue.poll() + " remueve"); // remueve sin lanzar excepcion
        System.out.println(queue.peek() + " toma, no remueve"); // toma pero no remueve
        System.out.println(queue.remove() + " remueve"); // remueve, en caso negativo lanza excepcion
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll()); // null
        //System.out.println(queue.remove()); // error, lista, vacia
    }
}
